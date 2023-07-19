package backjoon.problem.R20230719;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.19
 * ���� ������ : 2023.07.19
 * ���� : 15680�� - �������б�(YONSEI ���)
 * ���� �̷� : �輱��, 2023.07.19(����Ǯ��)
 * ���۱� : �輱��
 */
public class Yonsei {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String yonsei;
		int input = Integer.parseInt(br.readLine());
		
		
		if(input == 0) { yonsei = "YONSEI"; }
		else { yonsei = "Leading the Way to the Future"; }
		bw.write(yonsei);
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Yonsei().solution();
	}
}
