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
 * {@summary} Gum Gum for Jay Jay(���� ������� �ɸ� �� ���)
 * - �Է� : ù°�� - ���� ���� �ð�, ��
 * https://www.acmicpc.net/problem/26489
 */
public class GumGumForJayJay {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = 0;
		
		while(br.readLine() != null) {
			cnt++;
		}
		
		bw.write(cnt + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new GumGumForJayJay().solution();
	}
}
