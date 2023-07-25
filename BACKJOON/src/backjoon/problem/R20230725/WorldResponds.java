package backjoon.problem.R20230725;

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
 * ���� �ۼ��� : 2023.07.25
 * ���� ������ : 2023.07.25
 * ���� : 23234�� - The World Responds(����� �ȳ��� ���Ѵ�! ���)
 * ���� �̷� : �輱��, 2023.07.25(����Ǯ��)
 * ���۱� : �輱��
 */
public class WorldResponds {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("The world says hello!");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new WorldResponds().solution();
	}
}
