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
 * @category ����, ����, ��Ģ����
 * @updatedAt �輱��, 2023.08.01(����Ǯ��)
 * {@summary} Two-digit Integer(AB ���)
 * - �Է� : ù°�� - A, ��°�� - B
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
