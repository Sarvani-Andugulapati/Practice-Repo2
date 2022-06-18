package myfirstpackage;

public class Iftest {
static void easy(int N) {
	if (N<1)
		return; 
		easy(N-2);
		System.out.println(N);
		easy(N-3);
		System.out.println(N);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
easy(5);
	}

}
