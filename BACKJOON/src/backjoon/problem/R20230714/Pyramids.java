package backjoon.problem.R20230714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.14
 * 최초 변경일 : 2023.07.14
 * 목적 : 5341번 - 피라미드(피라미드 완성 할 블럭 총 개수 구하기)
 * 개정 이력 : 김선우, 2023.07.14(문제풀이)
 * 저작권 : 김선우
 */
public class Pyramids {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			long n = Long.parseLong(br.readLine());
			if(n == 0) break;
			sb.append(n*(n+1)/2).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void main(String[] args) throws Exception {
		new Pyramids().solution();
	}
}