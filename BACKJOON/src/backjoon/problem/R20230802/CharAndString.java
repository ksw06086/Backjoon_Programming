package backjoon.problem.R20230802;

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
 * @category 구현, 문자열
 * @updatedAt 김선우, 2023.08.02(문제풀이)
 * {@summary} 문자와 문자열(문자열의 index번째 문자 출력)
 * - 입력 : 첫째줄 - 문자열, 둘째줄 - index
 * https://www.acmicpc.net/problem/27866
 */
public class CharAndString {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int index = Integer.valueOf(br.readLine());
		
		bw.write(str.charAt(index-1) + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new CharAndString().solution();
	}
	
}