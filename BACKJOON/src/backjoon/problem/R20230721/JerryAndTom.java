package backjoon.problem.R20230721;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.21
 * 최초 변경일 : 2023.07.21
 * 목적 : 16430번 - 제리와 톰(제리가 훔쳐가고 남은 치즈)
 * 개정 이력 : 김선우, 2023.07.21(문제풀이)
 * 저작권 : 김선우
 */
public class JerryAndTom {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int p = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		
		bw.write((q-p) + " " + q);
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new JerryAndTom().solution();
	}
}