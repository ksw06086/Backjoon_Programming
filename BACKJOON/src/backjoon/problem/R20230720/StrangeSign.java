package backjoon.problem.R20230720;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.20
 * 최초 변경일 : 2023.07.20
 * 목적 : 15964번 - 이상한 기호(A@B 계산하기)
 * 개정 이력 : 김선우, 2023.07.20(문제풀이)
 * 저작권 : 김선우
 */
public class StrangeSign {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		bw.write((A+B)*(A-B)+ "\n");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new StrangeSign().solution();
	}
}
