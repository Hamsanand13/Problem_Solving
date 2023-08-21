package others;


public class NQueen 
{
	static int n=8;
	static boolean solveNQ(int board[][],int col)
	{
		if(col>=n)
		{
			return true;
		}
		for(int i =0;i<n;i++)
		{
			if(isSafe(board,i,col))
			{
				board[i][col]=1;
				if( solveNQ(board, col+1))
				{
					return true;
				}
			board[i][col]=0;
			}
		}
		return false;
	}
	static boolean isSafe(int[][] board, int row, int col) 
	{
		for(int i=0;i<col;i++)
		{
			if(board[row][i]==1)
			{
				return false;
			}
		}
		for(int i=row,j=col;i>=0 && j>=0;i--,j--)
		{
			if(board[i][j]==1)
			{
				return false;
			}
		}
		for(int i=row,j=col;i<n && j>=0;i++,j--)
		{
			if(board[i][j]==1)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		int board[][] = new int[8][8];
		if(solveNQ(board, 0))
		{
			for(int i =0;i<board.length;i++)
			{
				for(int j =0;j<board[i].length;j++)
				{
					System.out.print(board[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("no solution");
		}
	}
}
