package backjoon.problem.R20230711;

import java.math.BigInteger;
import java.util.Scanner;

// ���� 2338�� : ���ڸ� ���
public class LongCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger first = sc.nextBigInteger();
		BigInteger second = sc.nextBigInteger();
		
		System.out.println(first.add(second));
		System.out.println(first.subtract(second));
		System.out.println(first.multiply(second));
	}
}
