package backjoon.problem.R20230725;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.25
 * ���� ������ : 2023.07.25
 * ���� : 21598�� - SciComLove(���ϱ�)
 * ���� �̷� : �輱��, 2023.07.25(����Ǯ��)
 * ���۱� : �輱��
 */
public class SciComLove {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		if(N == 1) { bw.write("SciComLove"); }
		else { bw.write("SciComLove\nSciComLove"); }
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new SciComLove().solution();
	}
}
