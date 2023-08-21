package programs;
abstract class Plan 
{
	public int rate;
	abstract void getRate();
	
	void CalculateBill(int data)
	{
		System.out.print(data*rate);
	}
}
class DomesticPlan extends Plan
{
	public void getRate() 
	{
		rate =3;
	}
}
class IndustrialPlan extends Plan
{
	public void getRate() 
	{
		rate =5;
	}
}
class CommercialPlan extends Plan
{
	public void getRate() 
	{
		rate =4;
	}
}
public class GenerateBill 
{
	public static void main(String v[])
	{
		GetPlanFactory ob = new GetPlanFactory();
		Plan p = ob.getPlan("DomesticPlan");
		p.getRate();
		p.CalculateBill(2);
		
	}
}
class GetPlanFactory 
{
	public Plan getPlan(String plan)
	{
		if(plan==null)
		{
			return null;
		}
		else if (plan.equals("DomesticPlan")) 
		{
			return new DomesticPlan();
		} 
		else if(plan.equals("CommercialPlan"))
		{
			return new CommercialPlan();
		}
		else
		{
			return new IndustrialPlan();
		}
	}
}
