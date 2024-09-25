package whileloop;

public class fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=28;
int sum=0;
for(int n=1;n<=i/2;++n) {
	if(i%n==0) {
		sum+=n;
	}
}
if(sum==i) {
	System.out.println("perfect");}
else {
	System.out.println("not perfect");
}
}

}
