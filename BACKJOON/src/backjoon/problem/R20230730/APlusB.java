package backjoon.problem.R20230730;

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
 * @category ����, �ùķ��̼�
 * @updatedAt �輱��, 2023.07.30(����Ǯ��)
 * {@summary} A+B(A ���ϱ� B)
 * - �Է� : ù°�� - A, ��°�� - B
 * https://www.acmicpc.net/problem/26711
 */
public class APlusB {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BigInteger A = new BigInteger(br.readLine());
		BigInteger B = new BigInteger(br.readLine());
		
		bw.write(A.add(B) + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new APlusB().solution();
	}
}
