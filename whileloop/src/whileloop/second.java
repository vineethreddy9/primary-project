package whileloop;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=125421,sum=0,temp=0;
int m=i;
while(i!=0) {
	 temp=i%10;
	 sum=sum*10+temp;
	 i/=10;
}
if(m==sum)
	System.out.println("it is a palindrome");
else
	System.out.println("not palindrome");
	}

}
