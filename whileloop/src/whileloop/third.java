package whileloop;

public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=10,i=1,firstTerm=0,secondTerm=1;

while(i<=n) {
	 System.out.print(firstTerm + ", ");
	int nextterm=firstTerm+secondTerm;
	firstTerm=secondTerm;
	secondTerm=nextterm;
	++i;

	
}
	}

}
