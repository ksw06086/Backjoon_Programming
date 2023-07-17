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
 * 목적 : 11382번 - 꼬마 정민(세 개의 값 더하기)
 * 개정 이력 : 김선우, 2023.07.17(문제풀이)
 * 저작권 : 김선우
 */
public class ThreePlus {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		BigInteger a = new BigInteger(st.nextToken());
		BigInteger b = new BigInteger(st.nextToken());
		BigInteger c = new BigInteger(st.nextToken());
		System.out.println(a.add(b.add(c)));
	}
	
	public static void main(String[] args) throws Exception {
		new ThreePlus().solution();
	}
}
