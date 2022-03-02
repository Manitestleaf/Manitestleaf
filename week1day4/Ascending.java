package week1day4;

import java.util.Arrays;

public class Ascending {
public static void main(String[] args) {
		
		int[] a={60,18,39,29,73,5,71};
		
		Arrays.sort(a);
		
		for (int i = a.length-1; i >=0; i--) {
			System.out.println(a[i]);
		}
		
	}

}
