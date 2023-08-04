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
 * @category 구현, 시뮬레이션
 * @updatedAt 김선우, 2023.07.29(문제풀이)
 * {@summary} WARBOY(WARBOY 제품의 성능)
 * - 입력 : 첫째줄 - 경쟁사제품가격, 경쟁사제품성능, WARBOY제품가격
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