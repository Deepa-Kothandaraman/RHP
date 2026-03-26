import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int m[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				m[i][j]=sc.nextInt();
			}
		}
		int fir_mx=0,sec_mx=0;
		for(int i=0;i<c;i++)
		{
			if(m[0][i]>sec_mx && m[0][i]<fir_mx)
			{
				sec_mx=m[0][i];
			}
			if(m[0][i]>sec_mx)
			{
				int tem=fir_mx;
				fir_mx=m[0][i];
				sec_mx=tem;
			}
			// System.out.println(m[0][i]+" "+fir_mx+" "+sec_mx);
		}
		// System.out.println(fir_mx+" "+sec_mx);
		for(int i=1;i<r;i++)
		{
			int fir=0,sec=0;
			for(int j=0;j<c;j++)
			{
				// System.out.println(i+" "+j+" "+fir_mx);
				if(m[i-1][j]==fir_mx)
				{
					m[i][j]+=sec_mx;
				}
				else
				{
					m[i][j]+=fir_mx;
				}
				if(m[i][j]>sec && m[i][j]<fir)
				{
					sec=m[i][j];
				}
				if(m[i][j]>sec)
				{
					int tem=fir;
					fir=m[i][j];
					sec=tem;
				}
				System.out.println(i+" "+j+" "+m[i][j]);
			}
			fir_mx=fir;
			sec_mx=sec;
			// System.out.println();
			// System.out.println(fir_mx+" "+sec_mx);
		}
		// System.out.println(fir_mx+" "+sec_mx);
		System.out.print("Max_elem_sum "+fir_mx);
	}
}