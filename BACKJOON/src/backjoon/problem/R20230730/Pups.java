package backjoon.problem.R20230730;

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
 * @updatedAt 김선우, 2023.07.30(문제풀이)
 * {@summary} Pups(강아지 음식 가격 출력)
 * - 입력 : 첫째줄 - row 수, 둘째줄~ - 강아지 수, 강아지 한명당 먹는 양, 강아지 양 1파운드당 가격
 * https://www.acmicpc.net/problem/26575
 */
public class Pups {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double dogCnt = Double.parseDouble(st.nextToken());
			double oneDogAmount = Double.parseDouble(st.nextToken());
			double onePoundPrice = Double.parseDouble(st.nextToken());
			String DogFoodTotalPrice = String.format("$%.02f", dogCnt*oneDogAmount*onePoundPrice); 
			
			sb.append(DogFoodTotalPrice).append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Pups().solution();
	}
}
