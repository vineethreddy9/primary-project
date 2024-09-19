package controlstatements;

public class threetri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=90,b=40,c=50;
if(a==b&&b==c&&a==c) {
	System.out.println("equilateral");
}
else if(a==b||b==c||a==c) {
	System.out.println("isosceles");
}
	else if (a!=b&&b!=c&&a!=c) {
		System.out.println("scalene");
}
	}

}
