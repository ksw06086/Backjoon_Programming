package backjoon.problem.R20230715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.15
 * ���� ������ : 2023.07.15
 * ���� : 8370�� - Julka(��� ���� ��� ���α׷�)
 * ���� �̷� : �輱��, 2023.07.15(����Ǯ��)
 * ���۱� : �輱��
 */
public class Julka {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger total = new BigInteger(br.readLine());
		BigInteger diff = new BigInteger(br.readLine());
		BigInteger two = new BigInteger("2");
		
		BigInteger klaudia = (total.subtract(diff)).divide(two).add(diff); //(total-diff)/2+diff
		BigInteger natalia = (total.subtract(diff)).divide(two); //(total-diff)/2
		
		System.out.println(klaudia);
		System.out.println(natalia);
	}
	
	public static void main(String[] args) throws Exception {
		new Julka().solution();
	}
}
