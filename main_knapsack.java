import java.util.*;

class knap{
	private double[] weight,profit,ratio,sol;
	private double capacity;
	void accept()
	{
		Scanner s=new Scanner(System.in);
		int i;
		System.out.println("Enter the no of items:");
		int n=s.nextInt();
		weight=new double[n];
		profit=new double[n];
		ratio=new double[n];
		sol=new double[n];
		System.out.println("Enter the weight of items:");
		for(i=0;i<n;i++)
		{
			weight[i]=s.nextDouble();
		}
		System.out.println("Enter the profits:");
		for(i=0;i<n;i++)
		{
			profit[i]=s.nextDouble();
		}
		for(i=0;i<n;i++)
		{
			ratio[i]=profit[i]/weight[i];
		}
		System.out.println("Enter the capacty:");
		capacity=s.nextDouble();
	}

	int getindex()
{
	int index=-1;
	double high=0;
	for(int i=0;i<ratio.length;i++)
	{
		if(ratio[i]>high)
		{
			high=ratio[i];
			index=i;
		}
	}
	return index;
}
	void fill()
{
	double cw=0,cp=0;
	while(cw<capacity)
	{
		int item=getindex();
		if(item==-1)
			break;
		if(cw+weight[item]<=capacity)
		{
			cp+=profit[item];
			sol[item]=1;
			cw+=weight[item];
			ratio[item]=0;
		}
		else {
			cp+=ratio[item]*(capacity-cw);
			sol[item]=(capacity-cw)/weight[item];
			cw+=(capacity-cw);
		}
		System.out.println("Total profit: "+cp);
		System.out.println("Total weight: "+cw);
		System.out.println("Solution vector: ");
		for(double x:sol) {
			System.out.println(x+"\t");
		}
	}
	
}
}
public class main_knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		knap k=new knap();
		k.accept();
		k.fill();
	}

}
