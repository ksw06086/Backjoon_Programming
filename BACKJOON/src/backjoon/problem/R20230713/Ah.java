package backjoon.problem.R20230713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.13
 * 최초 변경일 : 2023.07.13
 * 목적 : 4999번 - 아!(내가 낼 수 있는 ah의 길이가 되는 의사를 찾아가야 함)
 * 개정 이력 : 김선우, 2023.07.13(문제풀이)
 * 저작권 : 김선우
 */
public class Ah {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String b = br.readLine();
		
		if(a.length() >= b.length()) {
			System.out.println("go");
		} else {
			System.out.println("no");
		}
	}
	
	public static void main(String[] args) throws Exception {
		new Ah().solution();
	}
}