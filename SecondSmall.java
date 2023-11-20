package home.assignment;

import java.util.Arrays;

public class SecondSmall {

	public static void main(String[] args) {
		
		int [] scores = {23,45,67,32,89,22};
		
		int size = scores.length;
		
		//System.out.println(size);
		
		Arrays.sort(scores);
		 
		for (int i=0; i<size; i++)
		{
			System.out.println("Sort order ascending :"+scores[i]);
		}	
		{
			System.out.println("The second small number is :"+scores[1]);
		}
		

	}

}
