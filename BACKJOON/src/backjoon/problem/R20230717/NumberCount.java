package backjoon.problem.R20230717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.17
 * ���� ������ : 2023.07.17
 * ���� : 10807�� - ���� ����(������ ���� �� �ش� ���� �� �� �ִ��� ã��)
 * ���� �̷� : �輱��, 2023.07.17(����Ǯ��)
 * ���۱� : �輱��
 */
public class NumberCount {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int searchNum = Integer.parseInt(br.readLine());
		int cnt = 0;
		while(n-- > 0) {
			if(Integer.parseInt(st.nextToken()) == searchNum) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] args) throws Exception {
		new NumberCount().solution();
	}
}
