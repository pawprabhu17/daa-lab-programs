import java.util.*;

public class hamiltonian {
	static int max=25;
	static int[] vertex =new int[max];		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,v1,v2,edges,n;
		int g[][]=new int[max][max];
		System.out.println("Enter the no of vertices:");
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				g[i][j]=0;
			}
			vertex[i]=0;
		}
		System.out.println("Enter the total number of edges:");
		edges=s.nextInt();
		for(i=1;i<=edges;i++)
		{
			v1=s.nextInt();
			v2=s.nextInt();
			g[v1][v2]=1;
			g[v2][v1]=1;
		}
		vertex[1]=1;
		System.out.println("Hamiltonian cycle(s) is/are:");
		hcycle(g,n,2);
	}
	public static void hcycle(int[][] g,int n,int k)
	{
		int i;
		while(true)
		{
			next_vertex(g,n,k);
			if(vertex[k]==0)
				return;
			if(k==n)
			{
				System.out.println("\n");
				for(i=1;i<=n;i++)
					System.out.print(vertex[i]+"--");
				System.out.print(" "+vertex[1]);
			}
			else
			{
				hcycle(g,n,k+1);
			}
		}
	}
	public static void next_vertex(int[][] g,int n,int k)
	{
		int j;
		while(true)
		{
			vertex[k]=(vertex[k]+1)%(n+1);
			if(vertex[k]==0)
				return;
			if(g[vertex[k-1]][vertex[k]]!=0)
			{
				for(j=1;j<=k-1;j++)
				{
					if(vertex[j]==vertex[k])
						break;
				}
				if(j==k)
				{
					if((k<n)||(k==n)&&(g[vertex[n]][vertex[1]]!=0))
						return;
				}
			}
		}
	}
}


