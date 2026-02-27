import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		comb(s,0,new StringBuilder(""));
		
	}
	public static void comb(String s,int ind,StringBuilder sb)
	{
		if(ind==s.length())
		{
			System.out.println(sb.toString());
			return;
		}
		sb.append(s.charAt(ind));
		comb(s,ind+1,sb);
		sb.deleteCharAt(sb.length()-1);
		comb(s,ind+1,sb);
	}
}