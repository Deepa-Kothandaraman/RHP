import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int q=sc.nextInt();
		int mat[][]=new int[q][4];
		int x1=0;
		int q1=q;
		while(q-->0)
		{
			
			int l=sc.nextInt();
			int r=sc.nextInt();
			int x=sc.nextInt();
			int y=sc.nextInt();
			// System.out.println(l+" "+r+" "+x+" "+y);
			mat[x1][0]=l;
			mat[x1][1]=r;
			mat[x1][2]=x;
			mat[x1][3]=y;
			
			x1+=1;
		}
		int lb=n-1,rb=n-1;
		int ans[]=new int[n];
		boolean vis[]=new boolean[n];
		
		for(int i=q1-1;i>=0;i--)
		{
			int l=mat[i][0],r=mat[i][1],x=mat[i][2],y=mat[i][3];
			// System.out.println(l+" "+r+" "+x+" "+y);
			if(l>lb && r<rb)
			{
				System.out.println(l+" "+r);
				continue;
			}
			int k=-1;
			// for(int i1=l;i1<=Math.max(r,lb);i1++)
			// {
				// if(vis[i1]) continue;
				// vis[i1]=true;
				// ans[i1]=(x+(k*y));
			// }
			// if(l<lb)
			// {
				// lb=l;
			// }
			// k+=(rb-lb);
			// for(int i1=rb+1;i1<=r;i1++)
			// {
				// if(vis[i1]) continue;
				// vis[i1]=true;
				// ans[i1]=(x+(k*y));
			// }
			for(int i1=l;i1<=r;i1++)
			{
				k+=1;
				if(vis[i1])
				{
					continue;
				}
				ans[i1]=(x+(k*y));	
				vis[i1]=true;
			}
			if(l<lb)
			{
				lb=l;
			}
			if(r>rb)
			{
				rb=r;
			}
			for(int i1=0;i1<n;i1++)
			{
				System.out.print(ans[i1]+" ");
			}
			System.out.println();
			if(lb==0 && rb==n)
			{
				break;
			}
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			if(ans[i]==0)
			{
				ans[i]=a[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			sum+=ans[i];
			System.out.print(ans[i]+" ");
		}
		System.out.println(sum);
	}
}