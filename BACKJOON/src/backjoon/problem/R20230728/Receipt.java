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
 * @category 구현, 시뮬레이션
 * @updatedAt 김선우, 2023.07.28(문제풀이)
 * {@summary} 영수증(영수증과 비교해서 총 금액이 맞나 확인)
 * - 입력 : 첫째줄 - 총 금액, 둘째줄 - 물품목록수, 셋째줄~ - 원가, 개수
 * https://www.acmicpc.net/problem/25304
 */
public class Receipt {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int payment = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int totalAmount = 0;
		
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int amount = Integer.parseInt(st.nextToken());
			int count = Integer.parseInt(st.nextToken());
			totalAmount += amount * count;
		}
		
		if(payment == totalAmount) {
			bw.write("Yes");
		} else {
			bw.write("No");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Receipt().solution();
	}
}
