package backjoon.problem.R20230715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.15
 * ���� ������ : 2023.07.15
 * ���� : 5522�� - ī�����(5���� ī����� ���� �ջ�)
 * ���� �̷� : �輱��, 2023.07.15(����Ǯ��)
 * ���۱� : �輱��
 */
public class CardGame {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int total = 0; // ����
		for(int i = 1; i <= 5; i++) {
			total += Integer.parseInt(br.readLine());
		}
		
		System.out.println(total);
	}
	
	public static void main(String[] args) throws Exception {
		new CardGame().solution();
	}
}
