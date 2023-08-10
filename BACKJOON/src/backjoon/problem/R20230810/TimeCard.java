package backjoon.problem.R20230810;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 수학, 사칙연산, 구현
 * @updatedAt 김선우, 2023.08.10(문제풀이)
 * {@summary} 타임 카드(근무 시간 구하기)
 * - 입력 : 첫째줄 - A씨 출근 시분초, 퇴근 시분초, 둘째줄 - B씨 출근,퇴근 , 첫째줄 - C씨 출근, 퇴근
 * https://www.acmicpc.net/problem/5575
 */
public class TimeCard {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = 3;
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			long startTotalSecond = Integer.valueOf(st.nextToken()) * 3600 +
									Integer.valueOf(st.nextToken()) * 60 +
									Integer.valueOf(st.nextToken());
			long endTotalSecond   = Integer.valueOf(st.nextToken()) * 3600 +
									Integer.valueOf(st.nextToken()) * 60 +
									Integer.valueOf(st.nextToken());
			long workTotalSecond = endTotalSecond - startTotalSecond;
			
			sb.append(workTotalSecond/3600).append(" ")
				.append((workTotalSecond%3600)/60).append(" ")
				.append(workTotalSecond%60).append("\n");
		}
		
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new TimeCard().solution();
	}
	
}
