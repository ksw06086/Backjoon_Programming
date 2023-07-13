package backjoon.problem.R20230713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.13
 * 최초 변경일 : 2023.07.13
 * 목적 : 3733번 - Shares
 * 개정 이력 : 김선우, 2023.07.13(문제풀이)
 * 저작권 : 김선우
 */
public class Shares {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String cur = br.readLine();
			if(cur == null) break;
			StringTokenizer st = new StringTokenizer(cur);
			int n = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			sb.append(s / (n+1)).append("\n");
		}
		System.out.println(sb);
	}
	
	public static void main(String[] args) throws Exception {
		new Shares().solution();
	}
}
