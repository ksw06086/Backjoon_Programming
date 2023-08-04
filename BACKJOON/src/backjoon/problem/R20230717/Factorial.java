package backjoon.problem.R20230717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.17
 * 최초 변경일 : 2023.07.17
 * 목적 : 10872번 - 팩토리얼(팩토리얼 구하기)
 * 개정 이력 : 김선우, 2023.07.17(문제풀이)
 * 저작권 : 김선우
 */
public class Factorial {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int sum = factorial(N);
		System.out.println(sum);
	}
	
	// 팩토리얼 재귀함수
	public static int factorial(int N) {
		if(N <= 1) return 1;
		return N * factorial(N - 1);
	}
	
	public static void main(String[] args) throws Exception {
		new Factorial().solution();
	}
}