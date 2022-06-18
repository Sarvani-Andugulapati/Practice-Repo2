package myfirstpackage;

import java.util.Scanner;
public abstract class ImplementAbstraction extends Abstraction{

	Scanner sc=new Scanner(System.in);
	private int sum;
	private int[] marks;
	
	//method InsertValues Implementation
	
	public void InsertValues(int size) {
		System.out.println("Enter student marks\n");
		marks = new int[size];
		for(int i=0; i<size;i++) {
			marks[i]=sc.nextInt();
		}
	}
	public double CalculatePercentage() {
		sum=0;
		if(marks!=null) {
		for(int i=0; i<marks.length;i++) {
			sum+=marks[i];
		}
		}else {
			System.out.println("Marks are not entered");
		}
		return ((sum*100)/(marks.length*100));
	}
	public void getArrayValues() {
		if(marks!=null) {
			for(int i=0; i<marks.length; i++) {
				System.out.println("Marks for subject"+(i+1)+"is"+marks[i]);
			}
		}
		else
		{
			System.out.println("Marks are not entered");
		}
	}
		public void setArrayValues(int subno, int newmarks) {
			marks[subno-1]=newmarks;
			System.out.println("The marks"+" "+marks[subno-1]+" "+
			"For Subject"+" "+subno+" "+"have been updated\n");
		}
}
