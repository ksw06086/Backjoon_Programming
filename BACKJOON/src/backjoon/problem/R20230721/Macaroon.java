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
 * 목적 : 17256번 - 달달함이 넘쳐흘러(가장 최적화 조건 케이크)
 * 개정 이력 : 김선우, 2023.07.21(문제풀이)
 * 저작권 : 김선우
 */
public class Macaroon {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer a = new StringTokenizer(br.readLine());
		StringTokenizer c = new StringTokenizer(br.readLine());
		
		int ax = Integer.parseInt(a.nextToken());
		int ay = Integer.parseInt(a.nextToken());
		int az = Integer.parseInt(a.nextToken());
		int cx = Integer.parseInt(c.nextToken());
		int cy = Integer.parseInt(c.nextToken());
		int cz = Integer.parseInt(c.nextToken());
		
		bw.write((cx-az) + "\n" + (cy/ay) + "\n" + (cz-ax));
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Macaroon().solution();
	}
}
