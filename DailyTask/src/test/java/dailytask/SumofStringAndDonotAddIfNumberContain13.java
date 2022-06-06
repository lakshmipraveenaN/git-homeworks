package dailytask;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumofStringAndDonotAddIfNumberContain13 {

	
	public int sumofnumbers(int a, int b, int c)
	{
		
		int num=13;
		int sum=0;
		if(a!=num&&b!=num&&c!=num)
		{
			sum=a+b+c;
			System.out.println("sum of a, b,c is"+sum);
		}
		
		
		else if(a!=num&&b!=num&&c==num)
		{
			sum=a+b;
			System.out.println("sum of a, b is"+sum);
		}
		else
		{
		sum=a;
			System.out.println("sum of a is"+sum);
		}
		 
		return sum;
	}
	
	@Test
	public void test1()
	{
		
		int sum=sumofnumbers(10,5,6);
		System.out.println(sum);
		Assert.assertEquals(sum,21);
	}
	@Test
	public void test2()
	{
		
		int sum=sumofnumbers(10,13,6);
		System.out.println(sum);
		Assert.assertEquals(sum,10);
	}
	@Test
	public void test3()
	{
		
		int sum=sumofnumbers(10,5,13);
		System.out.println(sum);
		Assert.assertEquals(sum,15);
	}
	}


