package whileloop;

public class thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0,n=1,m=0;
for(int l=1;l<=10;l++) {
	m=i+n;
	if(m==13||m==35)
		break;
	System.out.println(m);
	i=n;
	n=m;
	
}
	}

}
