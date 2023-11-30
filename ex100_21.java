package java_ex100;

import java.util.Scanner;

public class ex100_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int k = a*(int)Math.pow(2, b);

        System.out.println(k);
    }
}
