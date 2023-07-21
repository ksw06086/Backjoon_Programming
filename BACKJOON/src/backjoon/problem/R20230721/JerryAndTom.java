package backjoon.problem.R20230721;

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
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.21
 * ���� ������ : 2023.07.21
 * ���� : 16430�� - ������ ��(������ ���İ��� ���� ġ��)
 * ���� �̷� : �輱��, 2023.07.21(����Ǯ��)
 * ���۱� : �輱��
 */
public class JerryAndTom {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int p = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		
		bw.write((q-p) + " " + q);
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new JerryAndTom().solution();
	}
}
