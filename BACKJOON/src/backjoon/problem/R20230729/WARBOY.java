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
 * {@summary} WARBOY(WARBOY ��ǰ�� ����)
 * - �Է� : ù°�� - �������ǰ����, �������ǰ����, WARBOY��ǰ����
 * https://www.acmicpc.net/problem/26082
 */
public class WARBOY {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int competePrice = Integer.parseInt(st.nextToken());
		int competePerformance = Integer.parseInt(st.nextToken());
		int warboyPrice = Integer.parseInt(st.nextToken());
		
		
		bw.write((competePerformance/ competePrice) * 3 * warboyPrice + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new WARBOY().solution();
	}
}
