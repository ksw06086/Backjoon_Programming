package backjoon.problem.R20230715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.15
 * ���� ������ : 2023.07.15
 * ���� : 5597�� - ���� �� ���� ��..?(30�� �� �ȳ� 2�� ã��)
 * ���� �̷� : �輱��, 2023.07.15(����Ǯ��)
 * ���۱� : �輱��
 */
public class ProblemNotSubmit {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] arr = new boolean[31];
		// �� ��� �⼮ üũ
		for(int i = 0; i < 28; i++) {
			int n = Integer.parseInt(br.readLine());
			arr[n] = true;
		}
		
		for(int i = 1; i < arr.length; i++) {
			if(!arr[i]) System.out.println(i);
		}
	}
	
	public static void main(String[] args) throws Exception {
		new ProblemNotSubmit().solution();
	}
}
