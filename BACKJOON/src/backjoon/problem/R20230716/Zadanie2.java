package backjoon.problem.R20230716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.16
 * ���� ������ : 2023.07.16
 * ���� : 8871�� - Zadanie2(n���� ����, 1���� ������ ä�� Ƚ�� ���)
 * ���� �̷� : �輱��, 2023.07.16(����Ǯ��)
 * ���۱� : �輱��
 */
public class Zadanie2 {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int round = Integer.parseInt(br.readLine()) + 1;
		
		System.out.println(round*2 + " " + round*3);
	}
	
	public static void main(String[] args) throws Exception {
		new Zadanie2().solution();
	}
}
