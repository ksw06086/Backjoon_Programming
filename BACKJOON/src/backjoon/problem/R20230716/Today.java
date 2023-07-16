package backjoon.problem.R20230716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.16
 * ���� ������ : 2023.07.16
 * ���� : 10699�� - ���� ��¥(���� ��¥�� YYYY-MM-DD�� ���)
 * ���� �̷� : �輱��, 2023.07.16(����Ǯ��)
 * ���۱� : �輱��
 */
public class Today {
	private void solution() throws Exception {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		ZonedDateTime today = ZonedDateTime.now();
		System.out.println(today.format(formatter));
	}
	
	public static void main(String[] args) throws Exception {
		new Today().solution();
	}
}
