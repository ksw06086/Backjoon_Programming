package backjoon.problem.R20230718;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.18
 * ���� ������ : 2023.07.18
 * ���� : 14652�� - ���� �ູ�մϴ�~(��ȭ ���� �ڸ� ã������)
 * ���� �̷� : �輱��, 2023.07.18(����Ǯ��)
 * ���۱� : �輱��
 */
public class SeatFind {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		System.out.println((K / M) + " " + (K - (M * ( K / M))));
	}
	
	public static void main(String[] args) throws Exception {
		new SeatFind().solution();
	}
}
