package java_ex100;

import java.util.Scanner;

public class ex100_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        System.out.println(hour + ":" + minute);
        
        sc.close();
    }
}
