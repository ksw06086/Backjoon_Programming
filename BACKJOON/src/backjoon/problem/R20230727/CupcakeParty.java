package backjoon.problem.R20230727;

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
 * @updatedAt �輱��, 2023.07.27(����Ǯ��)
 * {@summary} Cupcake Party
 * - �Է� : ù°�� - 8��¥�� ���� ����, ��°�� - 3��¥�� ���� ����
 * https://www.acmicpc.net/problem/24568
 */
public class CupcakeParty {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		if((a*8)+(b*3) <= 28) {
			bw.write(0 + "\n");
		} else {
			bw.write((a*8)+(b*3)-28 + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new CupcakeParty().solution();
	}
}
