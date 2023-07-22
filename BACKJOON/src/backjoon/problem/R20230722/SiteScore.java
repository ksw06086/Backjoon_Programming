package backjoon.problem.R20230722;

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
 * 최초 작성일 : 2023.07.22
 * 최초 변경일 : 2023.07.22
 * 목적 : 20254번 - Site Score(공식 계산 출력)
 * 개정 이력 : 김선우, 2023.07.22(문제풀이)
 * 저작권 : 김선우
 */
public class SiteScore {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer n = new StringTokenizer(br.readLine());
		
		int ur = Integer.parseInt(n.nextToken());
		int tr = Integer.parseInt(n.nextToken());
		int uo = Integer.parseInt(n.nextToken());
		int to = Integer.parseInt(n.nextToken());
		
		bw.write((56*ur)+(24*tr)+(14*uo)+(6*to) + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new SiteScore().solution();
	}
}
