package backjoon.problem.R20230715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.15
 * 최초 변경일 : 2023.07.15
 * 목적 : 8370번 - Julka(사과 문제 출력 프로그램)
 * 개정 이력 : 김선우, 2023.07.15(문제풀이)
 * 저작권 : 김선우
 */
public class Julka {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger total = new BigInteger(br.readLine());
		BigInteger diff = new BigInteger(br.readLine());
		BigInteger two = new BigInteger("2");
		
		BigInteger klaudia = (total.subtract(diff)).divide(two).add(diff); //(total-diff)/2+diff
		BigInteger natalia = (total.subtract(diff)).divide(two); //(total-diff)/2
		
		System.out.println(klaudia);
		System.out.println(natalia);
	}
	
	public static void main(String[] args) throws Exception {
		new Julka().solution();
	}
}
