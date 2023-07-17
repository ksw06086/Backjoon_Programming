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
 * 목적 : 10757번 - 큰 수 A+B(큰 수 더하기)
 * 개정 이력 : 김선우, 2023.07.17(문제풀이)
 * 저작권 : 김선우
 */
public class BigNumberPlus {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		BigInteger a = new BigInteger(st.nextToken());
		BigInteger b = new BigInteger(st.nextToken());		
		System.out.println(a.add(b));
	}
	
	public static void main(String[] args) throws Exception {
		new BigNumberPlus().solution();
	}
}
