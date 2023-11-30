package java_ex100;

import java.util.Scanner;

public class ex100_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.printf("%d.%02d.%02d", a, b, c);
    }
}
