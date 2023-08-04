package backjoon.problem.R20230715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.15
 * 최초 변경일 : 2023.07.15
 * 목적 : 7891번 - Can you add this?(두 수의 합 출력)
 * 개정 이력 : 김선우, 2023.07.15(문제풀이)
 * 저작권 : 김선우
 */
public class CanYouAddThis {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a+b).append("\n");
		}
		System.out.println(sb);
	}
	
	public static void main(String[] args) throws Exception {
		new CanYouAddThis().solution();
	}
}