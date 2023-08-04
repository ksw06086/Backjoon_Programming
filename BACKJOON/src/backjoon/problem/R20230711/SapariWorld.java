package backjoon.problem.R20230711;

import java.util.Scanner;

// ���ĸ� ����
public class SapariWorld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long m = sc.nextLong();
		System.out.println(Math.abs(n-m));
	}
}