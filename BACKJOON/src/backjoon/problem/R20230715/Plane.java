package backjoon.problem.R20230715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.15
 * 최초 변경일 : 2023.07.15
 * 목적 : 8370번 - Plane(좌석의 총 개수)
 * 개정 이력 : 김선우, 2023.07.15(문제풀이)
 * 저작권 : 김선우
 */
public class Plane {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n1 = Integer.parseInt(st.nextToken());
		int k1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		int k2 = Integer.parseInt(st.nextToken());
		
		System.out.println(n1*k1+n2*k2);
	}
	
	public static void main(String[] args) throws Exception {
		new Plane().solution();
	}
}