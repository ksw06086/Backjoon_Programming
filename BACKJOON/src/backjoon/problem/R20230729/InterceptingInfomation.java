package backjoon.problem.R20230729;

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
 * @updatedAt �輱��, 2023.07.29(����Ǯ��)
 * {@summary} Intercepting Information(��ȣ ���� ���)
 * - �Է� : ù°�� - 8��Ʈ ������� �� ����(9�� ����)
 * https://www.acmicpc.net/problem/26209
 */
public class InterceptingInfomation {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		bw.write(bitTest(st) + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static String bitTest(StringTokenizer st) throws Exception {
		while(st.countTokens() > 0) {
			if(st.nextToken().equals("9")) { return "F"; }
		}
		return "S";
	}
	
	public static void main(String[] args) throws Exception {
		new InterceptingInfomation().solution();
	}
}
