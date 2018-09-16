import java.util.Scanner;

public class tsp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.println("ENter the number of cities:");
		int n=s.nextInt();
		int[] path = new int[n + 1];
		int[] tempPath = new int[n + 1];
		int cost[][] =new int[n+1][n+1];
		int se[]=new int[n+1];
		System.out.println("Enter the cost adjacency matrix:");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
				cost[i][j]=s.nextInt();
			se[i]=1;
		}
		tempPath[0] = 0;
        tempPath[n] = 0;
		int a=g(1,n-1,cost,se,n);
		System.out.println("The min cost in optimal tour is: "+ a);
	}
	static int g(int i,int s,int[][] cost,int[] set,int n)
	{
		int[] newset=new int[n+1];
		int[] selected=new int[n+1];
		//int[] tour=new int[n+1];
		for(int j=1;j<=n;j++)
			newset[j]=set[j];
		newset[i]=0;
		if(s==0)
			return cost[i][1];
		for(int k=0,j=2;k<s;j++)
		{
			if(newset[j]!=0)
			{
				selected[k]=cost[i][j]+g(j,s-1,cost,newset,n);
				k++;
			
			}
		}
		int min=999;
		for(int j=0;j<s;j++)
		{
			if(selected[j]<min)
				min=selected[j];
		}
		return min;
	}

}
