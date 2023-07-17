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
 * ���� : 11382�� - ���� ����(�� ���� �� ���ϱ�)
 * ���� �̷� : �輱��, 2023.07.17(����Ǯ��)
 * ���۱� : �輱��
 */
public class ThreePlus {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		BigInteger a = new BigInteger(st.nextToken());
		BigInteger b = new BigInteger(st.nextToken());
		BigInteger c = new BigInteger(st.nextToken());
		System.out.println(a.add(b.add(c)));
	}
	
	public static void main(String[] args) throws Exception {
		new ThreePlus().solution();
	}
}