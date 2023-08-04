package backjoon.problem.R20230801;

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
 * @updatedAt 김선우, 2023.08.01(문제풀이)
 * {@summary} Hour(몇일은 몇시간인지)
 * - 입력 : 첫째줄 - 며칠
 * https://www.acmicpc.net/problem/27327
 */
public class Hour {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		bw.write(N*24 + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Hour().solution();
	}
	
}