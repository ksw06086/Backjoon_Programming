package backjoon.problem.R20230723;

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
 * ���� �ۼ��� : 2023.07.23
 * ���� ������ : 2023.07.23
 * ���� : 20492�� - ����(���� ���� �Ǽ��ɻ�� ���)
 * ���� �̷� : �輱��, 2023.07.23(����Ǯ��)
 * ���۱� : �輱��
 */
public class Tax {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		bw.write((int)(N-(N*0.22)) + " " + (int)(N-(N*0.2*0.22)));
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Tax().solution();
	}
}
