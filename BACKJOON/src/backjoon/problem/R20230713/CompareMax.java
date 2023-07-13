package backjoon.problem.R20230713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.13
 * ���� ������ : 2023.07.13
 * ���� : 4101�� - ũ��?(� ���� �� ū�� ��)
 * ���� �̷� : �輱��, 2023.07.13(����Ǯ��)
 * ���۱� : �輱��
 */
public class CompareMax {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String cur = br.readLine();
			StringTokenizer st = new StringTokenizer(cur);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a==0 && b==0)
				break;
			if(a>b)
				sb.append("Yes\n");
			else
				sb.append("No\n");
		}
		System.out.println(sb);
	}
	
	public static void main(String[] args) throws Exception {
		new CompareMax().solution();
	}
}
