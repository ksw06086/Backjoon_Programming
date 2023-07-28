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
 * @category ����
 * @updatedAt �輱��, 2023.07.28(����Ǯ��)
 * {@summary} �ڵ��� ü������ �Դϴ�.(����Ʈ ũ�⿡ �´� �ڷ��� ���)
 * - �Է� : ù°�� - ����Ʈ ũ�� �Է�
 * https://www.acmicpc.net/problem/25314
 */
public class CodingIsSports {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int byteSize = Integer.parseInt(br.readLine());
		String str = "long ";
		
		bw.write(str.repeat(byteSize/4) + "int");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new CodingIsSports().solution();
	}
}
