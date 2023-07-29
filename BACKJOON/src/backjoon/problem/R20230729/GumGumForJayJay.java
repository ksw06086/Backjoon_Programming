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
 * {@summary} Gum Gum for Jay Jay(문제 제출까지 걸린 분 출력)
 * - 입력 : 첫째줄 - 문제 제출 시간, 분
 * https://www.acmicpc.net/problem/26489
 */
public class GumGumForJayJay {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = 0;
		
		while(br.readLine() != null) {
			cnt++;
		}
		
		bw.write(cnt + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new GumGumForJayJay().solution();
	}
}
