package backjoon.problem.R20230717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.17
 * ���� ������ : 2023.07.17
 * ���� : 10872�� - ���丮��(���丮�� ���ϱ�)
 * ���� �̷� : �輱��, 2023.07.17(����Ǯ��)
 * ���۱� : �輱��
 */
public class Factorial {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int sum = factorial(N);
		System.out.println(sum);
	}
	
	// ���丮�� ����Լ�
	public static int factorial(int N) {
		if(N <= 1) return 1;
		return N * factorial(N - 1);
	}
	
	public static void main(String[] args) throws Exception {
		new Factorial().solution();
	}
}
