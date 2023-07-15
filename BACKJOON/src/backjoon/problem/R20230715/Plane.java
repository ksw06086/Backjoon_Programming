package backjoon.problem.R20230715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.15
 * ���� ������ : 2023.07.15
 * ���� : 8370�� - Plane(�¼��� �� ����)
 * ���� �̷� : �輱��, 2023.07.15(����Ǯ��)
 * ���۱� : �輱��
 */
public class Plane {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n1 = Integer.parseInt(st.nextToken());
		int k1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		int k2 = Integer.parseInt(st.nextToken());
		
		System.out.println(n1*k1+n2*k2);
	}
	
	public static void main(String[] args) throws Exception {
		new Plane().solution();
	}
}
