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
 * ���� : 16394�� - ȫ�ʹ��б�(ȫ�ʹ��б� �����ֳ�)
 * ���� �̷� : �輱��, 2023.07.21(����Ǯ��)
 * ���۱� : �輱��
 */
public class HongDae {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		bw.write((N - 1946) + "\n");
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new HongDae().solution();
	}
}
