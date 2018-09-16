import java.util.*;

public class floyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i,j;
		System.out.println("ENter the number of vertices:");
		int n=s.nextInt();
		int arr[][]=new int[n][n];
		System.out.println("Enter the cost adjacency matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		int d[][]=new int[n][n];
		d=arr;
		for(int k=0;k<n;k++)
		{
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					if(d[i][j]<d[i][k]+d[k][j])
					{
					d[i][j]=d[i][j];
					}
				else {
					d[i][j]=d[i][k]+d[k][j];
				}
			}
		}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(d[i][j]+" ");
			}
			System.out.println("\n ");
		}
		
		}			
	

}
