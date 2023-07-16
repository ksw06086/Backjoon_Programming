package backjoon.problem.R20230716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.16
 * ���� ������ : 2023.07.16
 * ���� : 9086�� - ���ڿ�(���ڿ� ù����, ���������� ���)
 * ���� �̷� : �輱��, 2023.07.16(����Ǯ��)
 * ���۱� : �輱��
 */
public class StrFirstEnd {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		while(n-- > 0) {
			String s = br.readLine();
			sb.append(s.charAt(0));
			sb.append(s.charAt(s.length()-1)).append("\n");
		}
		System.out.println(sb);
	}
	
	public static void main(String[] args) throws Exception {
		new StrFirstEnd().solution();
	}
}
