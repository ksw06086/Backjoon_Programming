package backjoon.problem.R20230718;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.18
 * ���� ������ : 2023.07.18
 * ���� : 14928�� - ū ��(ū ��<10^1000000>�� ���� ������ ���ض�)
 * ���� �̷� : �輱��, 2023.07.18(����Ǯ��)
 * ���۱� : �輱��
 */
public class BigNumberMod {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		/*BigInteger N = new BigInteger(br.readLine());
		BigInteger birth = new BigInteger("20000303");		
		System.out.println(N.remain(birth));*/
		
		// ������ ������ ���� �ϸ� �ſ� �� �ð��ʰ��� �ɸ�
		// �׷��� ���ڿ��� ����� �ϴ� ������� �������־�� �ð��ʰ��� �ȵ�
		// 1. remain * 10 : �ڸ��� �÷���
		// 2. '0'�� �� ���� : charAt�� ���� ���ڿ��� ��µǴ� ���ڿ� '0'�� ���� ���ڷ� �������
		//                  '1'�� 49, '0'�� 48��
		String N = br.readLine();
		long remain = 0;
		for(int i = 0; i < N.length(); i++) {
			remain = (remain * 10 + (N.charAt(i) - '0')) % 20000303;
		}
		bw.write(remain + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new BigNumberMod().solution();
	}
}
