package backjoon.problem.R20230713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.13
 * ���� ������ : 2023.07.13
 * ���� : 3733�� - Shares
 * ���� �̷� : �輱��, 2023.07.13(����Ǯ��)
 * ���۱� : �輱��
 */
public class Shares {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String cur = br.readLine();
			if(cur == null) break;
			StringTokenizer st = new StringTokenizer(cur);
			int n = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			sb.append(s / (n+1)).append("\n");
		}
		System.out.println(sb);
	}
	
	public static void main(String[] args) throws Exception {
		new Shares().solution();
	}
}
