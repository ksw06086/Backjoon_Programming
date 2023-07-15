package backjoon.problem.R20230714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.14
 * ���� ������ : 2023.07.14
 * ���� : 5341�� - �Ƕ�̵�(�Ƕ�̵� �ϼ� �� �� �� ���� ���ϱ�)
 * ���� �̷� : �輱��, 2023.07.14(����Ǯ��)
 * ���۱� : �輱��
 */
public class Pyramids {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			long n = Long.parseLong(br.readLine());
			if(n == 0) break;
			sb.append(n*(n+1)/2).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void main(String[] args) throws Exception {
		new Pyramids().solution();
	}
}
