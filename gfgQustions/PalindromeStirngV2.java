package gfgQustions;

import java.util.*;

public class PalindromeStirngV2 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		String rev = "";
		for(int i = s.length()-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		if(s.equals(rev)){
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		

	}

}
