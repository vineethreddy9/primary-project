package whileloop;

public class fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=145,sum=0,temp;
int i=n;
while(i>0) {
	int fact=1;
	temp=i%10;
	for (int m=1;m<=temp;++m) {
		fact*=m;
		
	}
	
	sum+=fact;
	i/=10;
}
if(sum==n)
	System.out.println("strong number");
else
	System.out.println("not strong number");
	}

}
