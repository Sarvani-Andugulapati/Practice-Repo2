package myfirstpackage;
import java.util.Scanner;
public class CalculatePercentage extends ImplementAbstraction{

	public static void main(String[] args) {
		int num;
		int subno;
		int newmarks;
		double percentage;
	Scanner sc= new Scanner(System.in);
	ImplementAbstraction encap = new CalculatePercentage();
	boolean exit = true;
	int ch;
	while(exit==true) {
	System.out.println("\nEnter your choice from:\n"+"1. Calculate Percentage\n"+
	"2. Update new marks\n"+"3. Display marks\n"+"4. Insert marks\n"+"0. exit");
	ch =sc.nextInt();
	switch(ch) {
	case 0:
		exit=false;
		System.out.println("\nExited Session succesfully\n");
		sc.close();
		break;
	case 1:
		System.out.println("\nEnter the no of subjects\n");
		num = sc.nextInt();
		encap.InsertValues(num);
		percentage = encap.CalculatePercentage();
		System.out.println("\nPercentage Scored is:"+" "+percentage);
		break;
	case 2:
		System.out.println("\nEnter Subject number\n");
		subno= sc.nextInt();
		System.out.println("\nEnter Marks\n");
		newmarks = sc.nextInt();
		encap.setArrayValues(subno, newmarks);
		System.out.println("\n The new marks are\n");
		encap.getArrayValues();
		percentage =encap.CalculatePercentage();
		System.out.println("\nThe new Percentage value is:"+" "+percentage);
		break;
	case 3:
		encap.getArrayValues();
		break;
	case 4:
		System.out.println("\nEnter the no of subjects\n");
		num = sc.nextInt();
		encap.InsertValues(num);
		System.out.println("\nMarks have been entered\n");
		break;
	default:
		System.out.println("Invalid Choice entered\n");
	}

	}
	}
}
