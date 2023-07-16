package backjoon.problem.R20230716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.16
 * 최초 변경일 : 2023.07.16
 * 목적 : 8871번 - Zadanie2(n번의 라운드, 1번의 시험경기 채점 횟수 출력)
 * 개정 이력 : 김선우, 2023.07.16(문제풀이)
 * 저작권 : 김선우
 */
public class Zadanie2 {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int round = Integer.parseInt(br.readLine()) + 1;
		
		System.out.println(round*2 + " " + round*3);
	}
	
	public static void main(String[] args) throws Exception {
		new Zadanie2().solution();
	}
}
