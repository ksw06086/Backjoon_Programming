package backjoon.problem.R20230726;

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
 * 최초 작성일 : 2023.07.26
 * 최초 변경일 : 2023.07.26
 * 목적 : 24078번 - Remainder(21로 나눈 나머지)
 * 개정 이력 : 김선우, 2023.07.26(문제풀이)
 * 저작권 : 김선우
 */
public class Remainder {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(Integer.parseInt(br.readLine())%21 + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Remainder().solution();
	}
}