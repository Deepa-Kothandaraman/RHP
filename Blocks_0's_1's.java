import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		PriorityQueue<Integer> amx=new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> bmn=new PriorityQueue<>();
		long MOD=1_000_000_007;
		long ans=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			amx.add(a[i]);
		}
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
			bmn.add(b[i]);
		}
		for(int i=0;i<n;i++)
		{
			int one=amx.poll();
			while(one-->0)
			{
				ans=((ans*2)+1)%MOD;
				
			}
			int zero=bmn.poll();
			while(zero-->0)
			{
				ans=(ans*2)%MOD;
			}
		}
		System.out.println(ans);
	}
}