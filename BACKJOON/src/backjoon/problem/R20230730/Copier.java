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
 * {@summary} Copier(숫자 복사본 같이 출력)
 * - 입력 : 첫째줄 - 수 갯수, 둘째줄~ - 수
 * https://www.acmicpc.net/problem/26574
 */
public class Copier {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			int number = Integer.parseInt(br.readLine());
			sb.append(number).append(" ").append(number).append("\n");
			
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Copier().solution();
	}
}