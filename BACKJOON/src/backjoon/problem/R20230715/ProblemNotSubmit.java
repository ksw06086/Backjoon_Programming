package backjoon.problem.R20230715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.15
 * 최초 변경일 : 2023.07.15
 * 목적 : 5597번 - 과제 안 내신 분..?(30명 중 안낸 2명 찾기)
 * 개정 이력 : 김선우, 2023.07.15(문제풀이)
 * 저작권 : 김선우
 */
public class ProblemNotSubmit {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] arr = new boolean[31];
		// 온 사람 출석 체크
		for(int i = 0; i < 28; i++) {
			int n = Integer.parseInt(br.readLine());
			arr[n] = true;
		}
		
		for(int i = 1; i < arr.length; i++) {
			if(!arr[i]) System.out.println(i);
		}
	}
	
	public static void main(String[] args) throws Exception {
		new ProblemNotSubmit().solution();
	}
}