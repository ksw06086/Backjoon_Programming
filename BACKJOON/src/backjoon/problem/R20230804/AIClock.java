package backjoon.problem.R20230804;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 수학, 사칙연산
 * @updatedAt 김선우, 2023.08.04(문제풀이)
 * {@summary} 인공지능 시계(언제 요리가 끝나는지 출력)
 * - 입력 : 첫째줄 - 시 분 초, 둘째줄 - 걸리는 초
 * https://www.acmicpc.net/problem/2530
 */
public class AIClock {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int hour = Integer.valueOf(st.nextToken());
		int minute = Integer.valueOf(st.nextToken());
		int second = Integer.valueOf(st.nextToken());
		int cookingTime = Integer.valueOf(br.readLine());
		
		second += cookingTime;
		minute += second/60;
		hour += minute/60;
		
		sb.append(hour%24).append(" ")
			.append(minute%60).append(" ")
			.append(second%60);
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new AIClock().solution();
	}
	
}
