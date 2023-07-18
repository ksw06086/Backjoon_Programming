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
 * ���� : 13277�� - ū �� ����(ū �� ����)
 * ���� �̷� : �輱��, 2023.07.18(����Ǯ��)
 * ���۱� : �輱��
 */
public class BigNumberMultiple {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		BigInteger a = new BigInteger(st.nextToken());
		BigInteger b = new BigInteger(st.nextToken());		
		System.out.println(a.multiply(b));
	}
	
	public static void main(String[] args) throws Exception {
		new BigNumberMultiple().solution();
	}
}
