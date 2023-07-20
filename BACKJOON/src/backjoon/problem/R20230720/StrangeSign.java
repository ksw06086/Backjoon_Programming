package backjoon.problem.R20230720;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.20
 * ���� ������ : 2023.07.20
 * ���� : 15964�� - �̻��� ��ȣ(A@B ����ϱ�)
 * ���� �̷� : �輱��, 2023.07.20(����Ǯ��)
 * ���۱� : �輱��
 */
public class StrangeSign {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		bw.write((A+B)*(A-B)+ "\n");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new StrangeSign().solution();
	}
}
