package backjoon.problem.R20230801;

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
 * @category 수학, 구현, 사칙연산
 * @updatedAt 김선우, 2023.08.01(문제풀이)
 * {@summary} Two-digit Integer(AB 출력)
 * - 입력 : 첫째줄 - A, 둘째줄 - B
 * https://www.acmicpc.net/problem/27331
 */
public class TwoDigitInteger {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String A = br.readLine();
		String B = br.readLine();
		
		sb.append(A).append(B).append("\n");
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new TwoDigitInteger().solution();
	}
	
}