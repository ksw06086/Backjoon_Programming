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
 * {@summary} Same Numbers(10자리 1의 자리 같은지)
 * - 입력 : 첫째줄 - 두자리 수
 * https://www.acmicpc.net/problem/27324
 */
public class SameNumbers {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String N = br.readLine();
		
		if(N.charAt(0) == N.charAt(1)) {sb.append(1);}
		else {sb.append(0);}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new SameNumbers().solution();
	}
	
}
