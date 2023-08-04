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
 * 목적 : 10807번 - 개수 세기(나열된 정수 중 해당 정수 몇 개 있는지 찾기)
 * 개정 이력 : 김선우, 2023.07.17(문제풀이)
 * 저작권 : 김선우
 */
public class NumberCount {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int searchNum = Integer.parseInt(br.readLine());
		int cnt = 0;
		while(n-- > 0) {
			if(Integer.parseInt(st.nextToken()) == searchNum) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] args) throws Exception {
		new NumberCount().solution();
	}
}