package backjoon.problem.R20230729;

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
 * @updatedAt 김선우, 2023.07.29(문제풀이)
 * {@summary} Intercepting Information(신호 에러 잡기)
 * - 입력 : 첫째줄 - 8비트 순서대로 값 들어옴(9면 에러)
 * https://www.acmicpc.net/problem/26209
 */
public class InterceptingInformation {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		bw.write(bitTest(st) + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static String bitTest(StringTokenizer st) throws Exception {
		while(st.countTokens() > 0) {
			if(st.nextToken().equals("9")) { return "F"; }
		}
		return "S";
	}
	
	public static void main(String[] args) throws Exception {
		new InterceptingInformation().solution();
	}
}