package backjoon.problem.R20230728;

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
 * @updatedAt 김선우, 2023.07.28(문제풀이)
 * {@summary} 성택이의 은밀한 비밀번호(비번 사용 가능?불가능?)
 * - 입력 : 첫째줄 - 시도할 비밀번호 개수, 둘째줄~ - 비밀번호
 * https://www.acmicpc.net/problem/25372
 */
public class SeongtaekPassword {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			String password = br.readLine();
			if(password.length() >= 6 && password.length() <= 9) {
				sb.append("yes").append("\n"); continue;
			}
			sb.append("no").append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new SeongtaekPassword().solution();
	}
}