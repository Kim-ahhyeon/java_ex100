package java_ex100;

import java.util.Scanner;
import java.util.ArrayList;
public class ex100_78 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		ArrayList<Integer> arr = new ArrayList<>();
		String[] part = input.split("");
		int b = 0;
		for (int i = 0; i < part.length; i++) {
			try {
				b = Integer.parseInt(part[i]);
			} catch (Exception e) {
				arr.add(i);
			}
		}
		arr.add(0,-1); 
		arr.add(0); 
	
		String[] numimshi = new String[arr.size()-2];
		for (int i = 0; i < numimshi.length ; i++) {
			numimshi[i] = "";
		} 
		int[] num = new int[arr.size()-2];
		for (int j = 1; j < arr.size(); j++) {
			for (int i = arr.get(j - 1) + 1; i < arr.get(j); i++) {
				numimshi[j-1] += part[i];
			}
		} 
		for (int i = 0; i < num.length ; i++) {
			num[i] = Integer.parseInt(numimshi[i]);
		}
		arr.remove(0);
		arr.remove(arr.size()-1);
		for (int i = 0 ; i < arr.size() - 1; i++) {
			switch (part[arr.get(i)]) {
				case "+":
					num[i + 1] = num[i] + num[i + 1];
					break;
				case "-":
					num[i + 1] = num[i] - num[i + 1];
					break;
				case "*":
					num[i + 1] = num[i] * num[i + 1];
					break;
				case "/":
					num[i + 1] = num[i] / num[i + 1];
				default:
					break;
			}
		}
		System.out.println(num[num.length - 1]);
	}
}
