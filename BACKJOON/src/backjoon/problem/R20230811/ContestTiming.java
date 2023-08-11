package backjoon.problem.R20230811;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 수학, 구현, 사칙연산
 * @updatedAt 김선우, 2023.08.11(문제풀이)
 * {@summary} Contest Timing(얼마나 콘테스트 진행했냐?)
 * - 입력 : 첫째줄 - 콘테스트 종료 시간(D H M)
 * https://www.acmicpc.net/problem/5928
 */
public class ContestTiming {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int endDay = Integer.valueOf(st.nextToken());
		int endHour = Integer.valueOf(st.nextToken());
		int endMinute = Integer.valueOf(st.nextToken());
		if((endDay*10000 + endHour*100 + endMinute) < 111111) {
			sb.append(-1);
		} else {
			long doingMinute = (endDay*1440 + endHour*60 + endMinute) -
								(11*1440 + 11*60 + 11);
			sb.append(doingMinute);
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new ContestTiming().solution();
	}
	
}
