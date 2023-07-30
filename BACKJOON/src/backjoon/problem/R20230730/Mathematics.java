package backjoon.problem.R20230730;

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
 * @updatedAt �輱��, 2023.07.30(����Ǯ��)
 * {@summary} Mathematics(�� ���ϱ�)
 * - �Է� : ù°�� - �� ����, ��°��~ - ��
 * https://www.acmicpc.net/problem/26545
 */
public class Mathematics {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int total = 0;
		
		while(N-- > 0) {
			total += Integer.parseInt(br.readLine());
		}
		
		bw.write(total + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Mathematics().solution();
	}
}
