package backjoon.problem.R20230713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.13
 * ���� ������ : 2023.07.13
 * ���� : 4999�� - ��!(���� �� �� �ִ� ah�� ���̰� �Ǵ� �ǻ縦 ã�ư��� ��)
 * ���� �̷� : �輱��, 2023.07.13(����Ǯ��)
 * ���۱� : �輱��
 */
public class Ah {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String b = br.readLine();
		
		if(a.length() >= b.length()) {
			System.out.println("go");
		} else {
			System.out.println("no");
		}
	}
	
	public static void main(String[] args) throws Exception {
		new Ah().solution();
	}
}
