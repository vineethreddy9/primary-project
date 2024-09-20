package loop;

public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=30,even=0,odd=0;
for(int i=1;i<=n;i++) {
	if(i%2==0) {
		even=even+i;
	}
	else
		odd=odd+i;
	
	
}
System.out.println(even+odd);
	}

}
