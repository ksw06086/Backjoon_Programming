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
 * @category ����, ���ڿ�
 * @updatedAt �輱��, 2023.08.02(����Ǯ��)
 * {@summary} ���ڿ� ���ڿ�(���ڿ��� index��° ���� ���)
 * - �Է� : ù°�� - ���ڿ�, ��°�� - index
 * https://www.acmicpc.net/problem/27866
 */
public class CharAndString {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int index = Integer.valueOf(br.readLine());
		
		bw.write(str.charAt(index-1) + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new CharAndString().solution();
	}
	
}
