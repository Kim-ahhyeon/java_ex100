package java_ex100;

import java.util.Scanner;

public class ex100_26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean a = scan.nextBoolean();
		
		boolean b = !a;
		System.out.println(b);
		
		scan.close();
	}

}
