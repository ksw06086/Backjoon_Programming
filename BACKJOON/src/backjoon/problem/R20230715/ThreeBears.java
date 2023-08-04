package backjoon.problem.R20230715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.15
 * 최초 변경일 : 2023.07.15
 * 목적 : 6840번 - Who is in the middle?
 * 개정 이력 : 김선우, 2023.07.15(문제풀이)
 * 저작권 : 김선우
 */
public class ThreeBears {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] bowls = new int[3];
		// 그릇 3개 값 입력
		for(int i = 0; i < 3; i++) {
			bowls[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(bowls);
		
		System.out.println(bowls[1]);
	}
	
	public static void main(String[] args) throws Exception {
		new ThreeBears().solution();
	}
}