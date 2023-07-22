package backjoon.problem.R20230722;

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
 * ���� �ۼ��� : 2023.07.22
 * ���� ������ : 2023.07.22
 * ���� : 18301�� - Rats(���� ��� ���)
 * ���� �̷� : �輱��, 2023.07.22(����Ǯ��)
 * ���۱� : �輱��
 */
public class Rats {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer n = new StringTokenizer(br.readLine());
		
		int n1 = Integer.parseInt(n.nextToken());
		int n2 = Integer.parseInt(n.nextToken());
		int n3 = Integer.parseInt(n.nextToken());
		
		bw.write((n1 + 1)*(n2 + 1) / (n3 + 1) - 1 + "\n");
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Rats().solution();
	}
}
