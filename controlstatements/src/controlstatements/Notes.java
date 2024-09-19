package controlstatements;

public class Notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=123340,n500=0,n200=0,n100=0,n50=0,n20=0;

if (i>=500) 
	n500=i/500;
i=i%500;
System.out.println("N500:" +n500);


 if(i>=200) 
	n200=i/200;
i=i%200;
System.out.println("N200:" +n200);
 if (i>=100) {
	n100=i/100;
i=i%100;
System.out.println("N100:" +n100);}
 if (i>=50) { 
	n50=i/50;
i=i%50;
System.out.println("N50:" +n50);}
 if (i>=20) {
	n20=i/20;
i=i%20;
System.out.println("N20:" +n20);}
	}

}
