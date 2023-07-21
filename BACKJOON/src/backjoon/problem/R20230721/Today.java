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
 * ���� : 16170�� - ������ ��¥��(���� ��¥ ���<UTC+0 ����>)
 * ���� �̷� : �輱��, 2023.07.21(����Ǯ��)
 * ���۱� : �輱��
 */
public class Today {
	private void solution() throws Exception {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(ZonedDateTime.now().format(DateTimeFormatter.ofPattern("yyyy\nMM\ndd")) + "\n");
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Today().solution();
	}
}
