package SubArray;

public class Program8 {

	public static void main(String[] args) {
		    int initialEnergy=5,initialExperience=3,energy[]= {1,4},experience[]= {2,5};
	
		        int ans=0;
		        for(int i=0;i<energy.length;i++)
		        {
		            if(initialEnergy<energy[i])
		            {
		                int add=energy[i]+1-initialEnergy;
		                ans+=add;
		                initialEnergy+=add;
		            }
		            initialEnergy-=energy[i];
		            if(initialExperience<experience[i])
		            {
		                int req = experience[i]+1-initialExperience;
		                ans+=req;
		                initialExperience+=req;
		            }
		            initialExperience+=experience[i];
		        }
		        System.out.print(ans);
		    }
	}

