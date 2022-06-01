package dailytask;


import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;


public class wordmultiples {
	public class Wordmultipleusingmap {

		
		public Map<String, Boolean> word(String s[])
		{
			
			Map<String,Boolean>hs=new HashMap<String,Boolean>();
			for(String s2:s)
			{
				if(hs.containsKey(s2))
				{
					hs.put(s2,true);
				}
				else
				{
					hs.put(s2,false);
				}
				
			}
			
			return hs;
		}
		
		@Test
		public void test1()
		{
			String s[]= {"a","b","c","d","a"};
			
			Map<String, Boolean> hs = word(s);
			
			System.out.println(hs);
		}
		

	}


}
