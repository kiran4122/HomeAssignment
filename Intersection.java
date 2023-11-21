package home.assignment;

public class Intersection {

	public static void main(String[] args) {

		int [] scores = {3,2,11,4,6,7};
		int [] marks = {1,2,8,4,9,7};
		
		int size = scores.length;
		int size1 = marks.length;
		
		for (int i=0;i<size;i++) {
			for (int j=0 ;j<size1;j++) {
				if (scores [i] == marks[j])
			{

					System.out.println(scores[i]);
				}
				}
			}
		}
		

	}


