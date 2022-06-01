package dailytask;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NotAddedIfStringDoesNotContain {

	public boolean  test(String s1, String s3)
	{
		String s2 ="not";
		boolean flag=false;
		if(!s1.contains(s2))
		{
			s3=s2.concat(s1);
		}
		else
		{
			System.out.println(s3=s1);
		}
		if(s3.equals(s1))
		{
			flag=true;
			System.out.println("s3 and s1 are equal :"+flag);
		}
		else
		{
			//flag=false;
			System.out.println("s3 and s1 are not equal"+flag);
		}
		return flag;
	}
@Test
public void test1()
{
	String s1 ="candy";
	String s2 ="not";
	String s3="";
	boolean flag=test(s1,s3);
	System.out.println(flag);
	Assert.assertEquals(flag,false);
	
}
@Test
public void test2()
{
	String s1="notbad";
	String s2="not";
	String s3="";
	boolean flag=test(s1,s3);
	System.out.println(flag);
	Assert.assertEquals(flag,true);
}

	

		

	}


