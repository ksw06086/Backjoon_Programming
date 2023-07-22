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
 * ���� : 18409�� - ������ ����(���ڿ� �߿� a,e,i,o,u ���� ����)
 * ���� �̷� : �輱��, 2023.07.22(����Ǯ��)
 * ���۱� : �輱��
 */
public class CountingVowels {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			switch (str.charAt(i)) {
				case 'a': case 'i': case 'u': case 'e': case 'o':
					cnt++;
			}
		}
		
		bw.write(cnt + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new CountingVowels().solution();
	}
}
