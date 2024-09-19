package controlstatements;

public class Per {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sub=5, totl=458, per=0;

per=(totl/sub);
System.out.println(per);
if (per>90)
	System.out.println("first");
else if (per>70&& per<=90)
	System.out.println("second");
else if(per>50&&per<=70)
	System.out.println("Third");
else 
	System.out.println("fail");
	
	}

}
