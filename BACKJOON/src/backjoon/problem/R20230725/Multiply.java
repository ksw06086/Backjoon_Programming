package backjoon.problem.R20230725;

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
 * 최초 작성일 : 2023.07.25
 * 최초 변경일 : 2023.07.25
 * 목적 : 22193번 - Multiply(더하기)
 * 개정 이력 : 김선우, 2023.07.25(문제풀이)
 * 저작권 : 김선우
 */
public class Multiply {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger a = new BigInteger(br.readLine());
		BigInteger b = new BigInteger(br.readLine());
		
		bw.write(a.multiply(b) + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Multiply().solution();
	}
}