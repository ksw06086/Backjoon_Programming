package backjoon.problem.R20230723;

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
 * 최초 작성일 : 2023.07.23
 * 최초 변경일 : 2023.07.23
 * 목적 : 20492번 - 세금(세금 제외 실수령상금 출력)
 * 개정 이력 : 김선우, 2023.07.23(문제풀이)
 * 저작권 : 김선우
 */
public class Tax {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		bw.write((int)(N-(N*0.22)) + " " + (int)(N-(N*0.2*0.22)));
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Tax().solution();
	}
}