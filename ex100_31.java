package java_ex100;

import java.util.Scanner;

public class ex100_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        if(grade>=90&&grade>=100){
            System.out.println('A');
        }
        else if(grade>=70&&grade<=89){
            System.out.println('B');
        }
        else if(grade>=69&&grade<=40){
            System.out.println('C');
        }
        else {
            System.out.println('D');
        }
    }
}
