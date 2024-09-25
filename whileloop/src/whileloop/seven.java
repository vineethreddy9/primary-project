package whileloop;

public class seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3,m=2;
boolean f=false;


while(m<=n/2) {
	if(n%m==0) {
		f=true;
		break;
		
	}
	m++;
		
}
if(!f)
	System.out.println(n+ "prime");
else
	System.out.println(n+"not");
	}

}
