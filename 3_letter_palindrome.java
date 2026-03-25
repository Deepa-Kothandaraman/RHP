// left to right traversal so right arr will be storing freq then reducing right updating left
// right to left traversal :lft arr will contain freq the reducing from left updating right
import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int left[]=new int[26];
		int right[]=new int[26];
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			right[c-97]+=1;
		}
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char x=s.charAt(i);
			right[x-97]-=1;
			for(int idx=0;idx<26;idx++)
			{
				int k=left[idx]*right[idx];
				sum+=(k);
				
			}
			left[x-97]+=1;
		}
		System.out.println(sum);
		// for(int i=0;i<26;i++)
		// {
			// System.out.println(((char)(i+97))+" "+right[i]);
		// }
	}
}