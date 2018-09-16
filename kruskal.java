import java.util.*;

class edge
{
	int src,dest,weight;
	edge(int src,int dest,int weight)
	{
		this.src=src;
		this.dest=dest;
		this.weight=weight;
	}
}
public class kruskal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENter the number of vertices:");
		int n=s.nextInt();
		int[][] adj=new int[n][n];
		System.out.println("Enter the cost adjacency matrix:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				adj[i][j]=s.nextInt();
			}
		}
		edge[] edges =new edge[(n*(n-1))/2];
		int k=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				edges[k]= new edge(i,j,adj[i][j]);
				k++;
			}
		}
		sort(edges);
		int minCost=0;
		int[] parent=new int[n];
		Arrays.fill(parent,-1);
		
		System.out.println("Edges:");
		for(int i=0;i<k;i++)
		{
			int lsrc=find(parent,edges[i].src);
			int ldest=find(parent,edges[i].dest);
		
			if(lsrc!=ldest)
			{
				System.out.println((edges[i].src+1)+"<-->"+(edges[i].dest+1));
				minCost+=edges[i].weight;
				union(parent,lsrc,ldest);
			}
		}
		System.out.println("The min cost is: "+ minCost);
		
		
	}
	public static void sort(edge[] edges)
	{
		for(int i=1;i<edges.length;i++)
		{
			for(int j=0;j<edges.length-i;j++)
			{
				if(edges[j].weight>edges[j+1].weight)
				{
					edge temp=edges[j];
					edges[j]=edges[j+1];
					edges[j+1]=temp;
					
				}
			}
		}
	}
	public static int find(int[] parent,int i)
	{
		if(parent[i]==-1)
			return i;
		return find(parent,parent[i]);
	}
	public static void union(int[] parent,int lsrc,int ldest)
	{
		parent[lsrc]=ldest;
	}

}
