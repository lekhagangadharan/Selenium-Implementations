package week1.day2.assignments;

public class FibbonacciSeries {

	public static void main(String[] args) {
		
		int first=0;
		int second=1;
		int n=8;
		
		
		for (int i = 1; i <=n; i++) {
			
			System.out.println(first + " ");
			
			int next =first+second;
			first=second;
			second=next;
			
		}
		System.out.println();

	}

}
