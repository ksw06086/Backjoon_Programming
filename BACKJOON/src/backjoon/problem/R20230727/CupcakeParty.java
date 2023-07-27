package backjoon.problem.R20230727;

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
 * @updatedAt 김선우, 2023.07.27(문제풀이)
 * {@summary} Cupcake Party
 * - 입력 : 첫째줄 - 8개짜리 상자 개수, 둘째줄 - 3개짜리 상자 개수
 * https://www.acmicpc.net/problem/24568
 */
public class CupcakeParty {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		if((a*8)+(b*3) <= 28) {
			bw.write(0 + "\n");
		} else {
			bw.write((a*8)+(b*3)-28 + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new CupcakeParty().solution();
	}
}
