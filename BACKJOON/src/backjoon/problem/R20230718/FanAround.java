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
 * ���� : 14581�� - �ҵ鿡�� �ѷ����� ȫ��
 * ���� �̷� : �輱��, 2023.07.18(����Ǯ��)
 * ���۱� : �輱��
 */
public class FanAround {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hongId = br.readLine();
		
		System.out.println(":fan::fan::fan:");
		System.out.println(":fan::" + hongId + "::fan:");
		System.out.println(":fan::fan::fan:");
	}
	
	public static void main(String[] args) throws Exception {
		new FanAround().solution();
	}
}
