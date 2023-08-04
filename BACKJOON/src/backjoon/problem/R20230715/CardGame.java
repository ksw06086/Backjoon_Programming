package backjoon.problem.R20230715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.15
 * 최초 변경일 : 2023.07.15
 * 목적 : 5522번 - 카드게임(5판의 카드게임 점수 합산)
 * 개정 이력 : 김선우, 2023.07.15(문제풀이)
 * 저작권 : 김선우
 */
public class CardGame {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int total = 0; // 총점
		for(int i = 1; i <= 5; i++) {
			total += Integer.parseInt(br.readLine());
		}
		
		System.out.println(total);
	}
	
	public static void main(String[] args) throws Exception {
		new CardGame().solution();
	}
}