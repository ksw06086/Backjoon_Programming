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
 * @category 구현, 시뮬레이션
 * @updatedAt 김선우, 2023.07.30(문제풀이)
 * {@summary} Mathematics(다 더하기)
 * - 입력 : 첫째줄 - 수 갯수, 둘째줄~ - 수
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