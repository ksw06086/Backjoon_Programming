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
 * ���� : 20254�� - Site Score(���� ��� ���)
 * ���� �̷� : �輱��, 2023.07.22(����Ǯ��)
 * ���۱� : �輱��
 */
public class SiteScore {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer n = new StringTokenizer(br.readLine());
		
		int ur = Integer.parseInt(n.nextToken());
		int tr = Integer.parseInt(n.nextToken());
		int uo = Integer.parseInt(n.nextToken());
		int to = Integer.parseInt(n.nextToken());
		
		bw.write((56*ur)+(24*tr)+(14*uo)+(6*to) + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new SiteScore().solution();
	}
}
