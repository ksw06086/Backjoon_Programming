package backjoon.problem.R20230731;

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
 * @category ����, ������, ��Ģ����
 * @updatedAt �輱��, 2023.07.31(����Ǯ��)
 * {@summary} ���簢��(���簢���� ���� ���ϱ�)
 * - �Է� : ù°�� - A(���α���), ��°�� - B(���α���)
 * https://www.acmicpc.net/problem/27323
 */
public class Rectangle {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		bw.write(A*B + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Rectangle().solution();
	}
	
}
