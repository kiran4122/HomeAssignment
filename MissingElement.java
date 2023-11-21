package home.assignment;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
	
		int arr[]= {1,2,3,5,7,6,8};
		int size = arr.length;
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]!=i+1) {
				System.out.println(i+1);
				break;
			}
		}
	

	
	}
}