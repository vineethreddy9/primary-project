package assignment;

public class Ram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=40,b=30,c=60,d=80;
int result= ((a>b)&&(a>c)&&(a>d))? a:((b>c)&&(b>d))? b:(c>d)?c:d;
System.out.println(result);

	}

}
