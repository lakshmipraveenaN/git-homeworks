package dailytask;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfAnArray {

	
	public int sumofinteger(int arr[])
	{
	int sum=0;
	
	for(int i=0;i<arr.length;i++)
	{
		sum+=arr[i];
	}
	System.out.println(sum);
	return sum;

	}
	@Test
	public void test1()
	{
		int arr[]= {1,2,3};
		int sum=sumofinteger(arr);
		Assert.assertEquals(sum,6);
	}

}
