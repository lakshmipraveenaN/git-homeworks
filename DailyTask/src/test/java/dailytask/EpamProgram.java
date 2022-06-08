package dailytask;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EpamProgram {
	public int travelbag(String s)
	{
	
	
	char ch[]=s.toCharArray();
	
	Set<Character>hs=new HashSet<Character>();
			
	for (char ch2 :ch) 
	{
		hs.add(ch2);
		
	}
		
System.out.println(hs);
	System.out.println(hs.size());
	return hs.size();
		
	}
	@Test
	public void test1()
	{
		String s="mmnmm";
		int hs = travelbag(s);
		Assert.assertEquals(hs,2);
	}

}
