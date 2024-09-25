package whileloop;

public class nine {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int f;
for(int i=1;i<=20;++i) {
	
	if(i==1||i==0||i==2) {
		continue;
	}
		
		 f=1;
		
		for(int n=2;n<=i/2;n++) {
			if(i%n==0) {
				f=0;
				break;}
				
			}
			if(f==1)
				System.out.println(i);
		}
			
		}

}
	


