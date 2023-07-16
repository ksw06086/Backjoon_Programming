package backjoon.problem.R20230716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.16
 * 최초 변경일 : 2023.07.16
 * 목적 : 9086번 - 문자열(문자열 첫글자, 마지막글자 출력)
 * 개정 이력 : 김선우, 2023.07.16(문제풀이)
 * 저작권 : 김선우
 */
public class StrFirstEnd {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		while(n-- > 0) {
			String s = br.readLine();
			sb.append(s.charAt(0));
			sb.append(s.charAt(s.length()-1)).append("\n");
		}
		System.out.println(sb);
	}
	
	public static void main(String[] args) throws Exception {
		new StrFirstEnd().solution();
	}
}
