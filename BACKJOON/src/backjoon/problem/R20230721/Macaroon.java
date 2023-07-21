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
 * ���� : 17256�� - �޴����� �����귯(���� ����ȭ ���� ����ũ)
 * ���� �̷� : �輱��, 2023.07.21(����Ǯ��)
 * ���۱� : �輱��
 */
public class Macaroon {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer a = new StringTokenizer(br.readLine());
		StringTokenizer c = new StringTokenizer(br.readLine());
		
		int ax = Integer.parseInt(a.nextToken());
		int ay = Integer.parseInt(a.nextToken());
		int az = Integer.parseInt(a.nextToken());
		int cx = Integer.parseInt(c.nextToken());
		int cy = Integer.parseInt(c.nextToken());
		int cz = Integer.parseInt(c.nextToken());
		
		bw.write((cx-az) + "\n" + (cy/ay) + "\n" + (cz-ax));
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Macaroon().solution();
	}
}
