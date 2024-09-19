package controlstatements;

public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int width=5,height=8,area=0,perimeter=0;
perimeter=2*(height+width);
area=width*height;
System.out.println(area);
System.out.println(perimeter);
if(area>perimeter)
	System.out.println("area");
else 
	System.out.println("perimeter");
	
	}

}
