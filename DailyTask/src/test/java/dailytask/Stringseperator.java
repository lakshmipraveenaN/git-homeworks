package dailytask;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Stringseperator {

	

		
		public String repeatStringWithSeperator(String word,String sep,int count) 
		{
			
			String  last="";

			for(int i=0;i<count;i++)
			{
				last+=word+sep;
			}
			int ind = last.lastIndexOf(sep);
			last = last.substring(0, ind);
		
			return last;
		}
@Test
public void test1()
{
	String result=repeatStringWithSeperator("this","x",3);
	String s="thisxthisxthis";
	Assert.assertEquals(result,s);
		
}
@Test
public void test2()
{
	String result=repeatStringWithSeperator("this","and",2);
	String s="thisandthis";
	Assert.assertEquals(result,s);
		
}
@Test
public void test3()
{
	String result=repeatStringWithSeperator("the","a",1);
	String s="the";
	Assert.assertEquals(result,s);
		
}
	}


