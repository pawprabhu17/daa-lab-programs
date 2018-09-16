import java.util.*;
public class prims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int i,j;
		System.out.println("Enter the no of vertices:");
		int n=s.nextInt();
		int adj[][]=new int[n][n];
		System.out.println("Enter the cost adjacency matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				adj[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter the source vertex:");
		int src=s.nextInt();
		boolean[] visited=new boolean[n];
		for(i=0;i<n;i++)
		{
			visited[i]=false;
		}
		visited[src-1]=true;
		int cost=0,source=0,target=0;
		for(i=1;i<n;i++)
		{
			int min=Integer.MAX_VALUE;
			for(j=0;j<n;j++)
			{
				if(visited[j])
				{
					for(int k=0;k<n;k++)
					{
						if(!visited[k] && min>adj[j][k])
						{
							min=adj[j][k];
							source=j;
							target=k;
						}
					}
				}
			}
			visited[target]=true;
			System.out.println("("+(source+1)+"--"+(target+1)+")");
			cost+=min;
		}
		System.out.println("The min cost :"+cost);
	}

}
