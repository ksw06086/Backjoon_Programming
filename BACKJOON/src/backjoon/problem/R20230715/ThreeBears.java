package backjoon.problem.R20230715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.15
 * ���� ������ : 2023.07.15
 * ���� : 6840�� - Who is in the middle?
 * ���� �̷� : �輱��, 2023.07.15(����Ǯ��)
 * ���۱� : �輱��
 */
public class ThreeBears {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] bowls = new int[3];
		// �׸� 3�� �� �Է�
		for(int i = 0; i < 3; i++) {
			bowls[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(bowls);
		
		System.out.println(bowls[1]);
	}
	
	public static void main(String[] args) throws Exception {
		new ThreeBears().solution();
	}
}
