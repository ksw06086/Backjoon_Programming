package backjoon.problem.R20230815;

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
 * @category 수학, 정수론
 * @updatedAt 김선우, 2023.08.15(문제풀이)
 * {@summary} Terms of Office(모든 직위 변경 년도 출력)
 * - 입력 : 첫째줄 - 모든 위치가 변경된 년도 / 둘째줄 - 계산 마지막 년도
 * https://www.acmicpc.net/problem/6888
 */
public class TermsOfOffice {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int startYear = Integer.valueOf(br.readLine());
		int endYear = Integer.valueOf(br.readLine());
		
		while(startYear <= endYear) {
			sb.append("All positions change in year ").append(startYear).append("\n");
			startYear += 60;
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new TermsOfOffice().solution();
	}
	
}
