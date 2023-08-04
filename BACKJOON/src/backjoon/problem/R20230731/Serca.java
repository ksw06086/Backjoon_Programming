package backjoon.problem.R20230731;

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
 * @updatedAt 김선우, 2023.07.31(문제풀이)
 * {@summary} Serca(하트 출력)
 * - 입력 : 첫째줄 - 하트 출력 개수
 * https://www.acmicpc.net/problem/26766
 */
public class Serca {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			sb.append(" @@@   @@@ ").append("\n");
			sb.append("@   @ @   @").append("\n");
			sb.append("@    @    @").append("\n");
			sb.append("@         @").append("\n");
			sb.append(" @       @ ").append("\n");
			sb.append("  @     @  ").append("\n");
			sb.append("   @   @   ").append("\n");
			sb.append("    @ @    ").append("\n");
			sb.append("     @     ").append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Serca().solution();
	}
	
}