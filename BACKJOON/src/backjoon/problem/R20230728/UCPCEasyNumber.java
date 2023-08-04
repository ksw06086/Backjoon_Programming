package backjoon.problem.R20230728;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 구현, 시뮬레이션
 * @updatedAt 김선우, 2023.07.28(문제풀이)
 * {@summary} UCPC에서 가장 쉬운 문제 번호는?(A 출력)
 * - 입력 : 첫째줄 - 년도입력
 * https://www.acmicpc.net/problem/25311
 */
public class UCPCEasyNumber {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("A");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new UCPCEasyNumber().solution();
	}
}