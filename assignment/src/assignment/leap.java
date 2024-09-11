package assignment;

public class leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 1600;

	    System.out.println((year%4==0)&&(year%100!=0)||(year%400==0)?"leap year":"not leap year");
	}

}
