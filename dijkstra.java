import java.util.*;

public class dijkstra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of vertices:");
		int n=s.nextInt();
		int adj[][]=new int[n][n];
		System.out.println("ENter the cost adjacency matrix:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				adj[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter the source vertex:");
		int src=s.nextInt();
		int[] dist=dijk(adj,src);
		for(int i=0;i<n;i++)
		{
			if((src-1)==i)
				continue;
			System.out.println("Shortest distance from "+src+" to "+(i+1)+" is "+dist[i]);
		}
	}
	public static int[] dijk(int[][] adj,int src)
	{
		int n=adj.length;
		int dist[]=new int[n];
		boolean[] visited = new boolean[n];
		for(int i=0;i<n;i++)
		{
			dist[i]=adj[src-1][i];
			visited[i]=false;
		}
		visited[src-1]=true;
		int unvis=-1;
		for(int i=1;i<n;i++)
		{
			int min=Integer.MAX_VALUE;
			for(int j=0;j<n;j++) {
				if(!visited[j] && min>dist[j])
				{
					min=dist[j];
					unvis=j;
				}
			}
			visited[unvis]=true;
			for(int v=0;v<n;v++)
			{
				if(!visited[v]&& dist[unvis]+adj[unvis][v]<dist[v])
					dist[v]=dist[unvis]+adj[unvis][v];
			}
		}
		return dist;
	}

}
