package controlstatements;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char c='9';
if(( c>='a'&&c<='z')||(c>='A'&&c<='Z'))
		System.out.println("alphabet");
else if(c>='0'&&c<='9')
	System.out.println("digits");
else
	System.out.println("special");
	}

}
