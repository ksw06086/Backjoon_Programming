package backjoon.problem.R20230728;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category ����, �ùķ��̼�
 * @updatedAt �輱��, 2023.07.28(����Ǯ��)
 * {@summary} ������(�������� ���ؼ� �� �ݾ��� �³� Ȯ��)
 * - �Է� : ù°�� - �� �ݾ�, ��°�� - ��ǰ��ϼ�, ��°��~ - ����, ����
 * https://www.acmicpc.net/problem/25304
 */
public class Receipt {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int payment = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int totalAmount = 0;
		
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int amount = Integer.parseInt(st.nextToken());
			int count = Integer.parseInt(st.nextToken());
			totalAmount += amount * count;
		}
		
		if(payment == totalAmount) {
			bw.write("Yes");
		} else {
			bw.write("No");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Receipt().solution();
	}
}
