package backjoon.problem.R20230718;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.18
 * 최초 변경일 : 2023.07.18
 * 목적 : 14652번 - 나는 행복합니다~(한화 팬의 자리 찾아주자)
 * 개정 이력 : 김선우, 2023.07.18(문제풀이)
 * 저작권 : 김선우
 */
public class SeatFind {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		System.out.println((K / M) + " " + (K - (M * ( K / M))));
	}
	
	public static void main(String[] args) throws Exception {
		new SeatFind().solution();
	}
}
