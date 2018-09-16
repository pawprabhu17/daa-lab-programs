import java.util.*;

public class quicksort {
	public static void sort(int[] a,int low,int high)
	{
		if(low<high)
		{
			int j=partition(a,low,high);
			sort(a,low,j-1);
			sort(a,j+1,high);
		}
	}
	public static int partition(int[] a,int low,int high)
	{
		int pivot=a[low];
		int i=low,j=high;
		do
		{
			do
			{
				i++;
			}while(a[i]<pivot && i<high);
			do
			{
				j--;
			}while(a[j]>pivot && j>low);
			if(i<j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}while(i<j);
		a[low]=a[j];
		a[j]=pivot;
		return j;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		Random r=new Random();
		int n,i;
		int a[];
		long start,end;
		System.out.println("Enter the size of array:");
		n=s.nextInt();
		a=new int[n];
		System.out.println("1.Best case\n 2.Average Case\n 3.Worst Case\n"); 
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:for(i=0;i<n;i++)
				a[i]=r.nextInt();
				start=System.nanoTime();
				sort(a,0,n-1);
				end=System.nanoTime();
				System.out.println("The sorted array is:\n");
				for(i=0;i<n;i++)
					System.out.println(a[i]+"\t");
				System.out.println("Time taken:"+(end-start)+"ns");
				break;
		case 2:for(i=0;i<n;i++)
				a[i]=r.nextInt();
				start=System.nanoTime();
				sort(a,0,n-1);
				end=System.nanoTime();
				System.out.println("The sorted array is:\n");
				for(i=0;i<n;i++)
					System.out.println(a[i]+"\t");
				System.out.println("Time taken:"+(end-start)+"ns");
				break;
		case 3:for(i=0;i<n;i++)
				a[i]=i+1;
				start=System.nanoTime();
				sort(a,0,n-1);
				end=System.nanoTime();
				System.out.println("The sorted array is:\n");
				for(i=0;i<n;i++)
					System.out.println(a[i]+"\t");
				System.out.println("Time taken:"+(end-start)+"ns");
				break;
		}
		}
	
}
