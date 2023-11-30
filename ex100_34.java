package java_ex100;

import java.util.Scanner;

public class ex100_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
        	int a = sc.nextInt();
        	System.out.println(a);
        	if(a==0) {
        		break;
        	}
        }
        sc.close();
    }
}
