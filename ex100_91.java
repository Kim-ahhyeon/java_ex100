package java_ex100;

import java.util.Scanner;

public class ex100_91 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < b.length; i++) {
            b[i] = scan.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = i; j < b.length; j++) {
                System.out.print(b[j]+ " ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(b[j] + " ");
            }
            System.out.println();
        }
    }
}
