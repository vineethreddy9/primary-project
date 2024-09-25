package whileloop;

public class seventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=23;

while(n>0) {
	if(n<0)n=-n;
	int sq=n*n;
	n/=10;
	sq/=10;
if(n%10!=sq%10)
System.out.println("automorphic");
else
	System.out.println("not");
	}
	}
}
