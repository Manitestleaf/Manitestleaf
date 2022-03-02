package week1day4;

import java.util.Arrays;

public class MissingElement {
public static void main(String[] args) {
		
		int[] arr = {1,7,8,2,6,3,4,9,10};
		
		Arrays.sort(arr);
		
		for (int i = 1; i < arr.length; i++) 
		{
			
			if(arr[i-1]!=i)
			{
				System.out.println("The missing element is:"+i);
				break;
			}
		}
	}
}
