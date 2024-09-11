package assignment;

public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,total;
	      int a[] = {10,6,9,2,7};
	      int n = 5;
	      total = 0;

	      for(i=0; i<n; i++) {
	         total += a[i];
	      }
	      System.out.println( total/(float)n);
	}

}
