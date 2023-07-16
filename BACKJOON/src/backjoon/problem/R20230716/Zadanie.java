package backjoon.problem.R20230716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.16
 * 최초 변경일 : 2023.07.16
 * 목적 : 8545번 - Zadanie(단어 역으로 전환하기)
 * 개정 이력 : 김선우, 2023.07.16(문제풀이)
 * 저작권 : 김선우
 */
public class Zadanie {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(new StringBuilder(br.readLine()).reverse());
	}
	
	public static void main(String[] args) throws Exception {
		new Zadanie().solution();
	}
}
