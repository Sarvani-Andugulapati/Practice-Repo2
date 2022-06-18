
package myfirstpackage;

public class ConstructorDemo {

	public ConstructorDemo() {
	System.out.println("Good morning one and all.\n"+"Today's session is taken by \n");
	}
	public ConstructorDemo(String name, int exp, String city) {
		System.out.println(name +" "+ "Having total of" + " "+exp + " "+"Years of experience in software industry\n"+ "All the way from"+" "+city);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo contructorDemo;
contructorDemo= new ConstructorDemo();
contructorDemo= new ConstructorDemo("Girish Maharjan", 15, "Gujarat");

	}

}

