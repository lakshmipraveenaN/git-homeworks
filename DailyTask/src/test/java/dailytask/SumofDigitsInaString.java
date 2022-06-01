package dailytask;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumofDigitsInaString {

	
	public int sumofdigit(String s )
	{
		
		char[] ch=s.toCharArray();
		
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(ch[i]))
			{
				System.out.println(ch[i]);
				int a=Integer.parseInt(String.valueOf(ch[i]));
				sum=sum+a;
			}
		}
		//System.out.println(sum);
		return sum;
		
	}
	
	@Test
	public void test1()
	{
		String s="aa11b33";
		int sum=sumofdigit(s);
		System.out.println(sum);
		Assert.assertEquals(sum,8);
		
	}

	@Test
	public void test2()
	{
		String s="choclate";
		int sum=sumofdigit(s);
		System.out.println(sum);
		Assert.assertEquals(sum,0);
		
	}
}
