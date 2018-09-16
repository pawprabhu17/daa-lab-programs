import java.util.*;

public class mergesort {
	public static void sort(int[] a,int low,int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			sort(a,low,mid);
			sort(a,mid+1,high);
			merge(a,low,mid,high);
		}
	}
	public static void merge(int[] a,int low,int mid,int high)
	{
		int[] b=new int[high+1];
		int h=low,i=low,j=mid+1;
		while((h<=mid)&&(j<=high))
		{
			if(a[h]<a[j])
			{
				b[i]=a[h];
				h++;
			}
			else
			{
				b[i]=a[j];
				j++;
			}
			i++;
			
		}
		if(h>mid)
		{
			for(int k=j;k<=high;k++)
			{
				b[i]=a[k];
				i++;
			}
			
		}
		else
		{
			for(int k=h;k<=mid;k++)
			{
				b[i]=a[k];
				i++;
			}
		}
		for(int k=low;k<=high;k++)
			a[k]=b[k];
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
				a[i]=i;
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
				a[i]=n-i;
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
