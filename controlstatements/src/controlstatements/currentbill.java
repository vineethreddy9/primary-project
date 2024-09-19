package controlstatements;

public class currentbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=900, price=0;
if(a>=0&& a<=200)
	price=100;
else if(a>200&&a<=300)
	price=200;
else if(a>300&&a<=500)
	price=400;
else
	price=500;
System.out.println(price);
	}

}
