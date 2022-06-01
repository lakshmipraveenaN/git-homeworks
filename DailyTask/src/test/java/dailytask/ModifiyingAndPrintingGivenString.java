package dailytask;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ModifiyingAndPrintingGivenString {

	//public static void main(String[] args) {
	public Map<String,String> mapprogram(HashMap<String,String>hs)
	{
		
		
		if(hs.containsKey("b")||hs.containsKey("c"))
		{
		hs.replace("b","aaa");
		hs.remove("c");
		}
	
		return hs;
	}
	@Test
	public void test1()
	{
		HashMap<String, String>map=new HashMap<String,String>();
		map.put("a","aaa");
		map.put("b","bbb");
		map.put("c","ccc");
		Map<String,String>hs=mapprogram(map);
		System.out.println(hs);
		Assert.assertEquals(hs.toString(),"{a=aaa, b=aaa}");
		
	}
	

}
