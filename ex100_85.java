package java_ex100;

import java.util.Scanner;

public class ex100_85 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        for (int i=n; i>0; i--) {
            for (int j=i; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
