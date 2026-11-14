package java_string_programs;

import java.util.Scanner;

public class count_words {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' '&& (i==0||s.charAt(i-1)==' ')) {
				count++;
			}
		}System.out.println(count);
	}

}
