package dailytask;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortingFirstAndLastNumberInTheGivenArray {
public int[] test(int arr[])
{
	
		
		System.out.println("Original Array: "+Arrays.toString(arr)); 
		int x = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = x;
		System.out.println("New array after swaping the first and last elements: "+Arrays.toString(arr));
		return arr; 
		
}
@Test
public void test1()
{
	int arr2[]= {1,2,3,4};
	int[] arr=test( arr2);
	int arr3[]= {4,2,3,1};
	Assert.assertEquals(arr,arr3);
	
}
		
		
	}

