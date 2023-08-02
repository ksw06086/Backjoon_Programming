package backjoon.problem.R20230802;

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
 * @category ����, ��Ģ����
 * @updatedAt �輱��, 2023.08.02(����Ǯ��)
 * {@summary} ���ڹ�(���ڹ� �� �� �ִ��� ������ ����)
 * - �Է� : ù°�� - 100�� ����, ���ڹ� �ݾ�
 * https://www.acmicpc.net/problem/27959
 */
public class Chocobar {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int coinCount = Integer.valueOf(st.nextToken());
		int chocobarPrice = Integer.valueOf(st.nextToken());
		if(coinCount*100 >= chocobarPrice) { bw.write("Yes"); }
		else { bw.write("No"); }
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Chocobar().solution();
	}
	
}
