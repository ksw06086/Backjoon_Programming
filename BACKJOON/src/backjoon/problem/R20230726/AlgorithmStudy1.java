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

/**
 * @author swkim
 * @category ����, �ùķ��̼�
 * @updatedAt �輱��, 2023.07.26(����Ǯ��)
 * {@summary}
 * - ù°�� : �ڵ�1�� ���� Ƚ�� ���
 * - ��°�� : �˰��� ����ð��� ��� �ð� - 0, n�� ��� - 1, n2�� ��� - 2, n3�� ��� - 3, n3���� ū �ð��� ��� - 4
 * https://www.acmicpc.net/problem/24262
 * �˰��� ���� - �˰����� ���� �ð� 1(�˰��� ���� �ð� ���)
 */
public class AlgorithmStudy1 {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		bw.write(1 + "\n" + 0);
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new AlgorithmStudy1().solution();
	}
}
