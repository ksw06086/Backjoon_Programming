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
 * {@summary} Po6nh30h Kpy30(무인도에서 시간 세기)
 * - 입력 : 첫째줄 - 총 시간
 * https://www.acmicpc.net/problem/27219
 */
public class MuindoTimeCounting {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		String one = "I";
		String five = "V";
		sb.append(five.repeat(N/5)).append(one.repeat(N%5)).append("\n");
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new MuindoTimeCounting().solution();
	}
	
}
