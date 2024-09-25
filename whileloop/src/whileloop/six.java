package whileloop;

public class six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=100;++i) {
	
int sum=0,
r,temp=0;
temp=i;
int p=String.valueOf(i).length();

while(temp>0) {
 r=temp%10;
	sum+=Math.pow(r, p);
	temp/=10;

}
if(sum==i) {
	System.out.println(i);
	System.out.println("amstrong number");
}
	}

	}}
