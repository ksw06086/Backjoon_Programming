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
 * {@summary} 시험 점수(민국이와 만국이의 시험점수 비교)
 * - 입력 : 첫째줄 - 민국이 정,수,과,영 점수 / 둘째줄 - 만세 정,수,과,영 점수
 * https://www.acmicpc.net/problem/5596
 */
public class TestScore {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer mankookScores = new StringTokenizer(br.readLine());
		StringTokenizer manseScores = new StringTokenizer(br.readLine());
		int mankookTotal  = Integer.valueOf(mankookScores.nextToken()) +
							Integer.valueOf(mankookScores.nextToken()) +
							Integer.valueOf(mankookScores.nextToken()) +
							Integer.valueOf(mankookScores.nextToken());
		int manseTotal    = Integer.valueOf(manseScores.nextToken()) +
							Integer.valueOf(manseScores.nextToken()) +
							Integer.valueOf(manseScores.nextToken()) +
							Integer.valueOf(manseScores.nextToken());
		
		if(mankookTotal >= manseTotal) { sb.append(mankookTotal); }
		else { sb.append(manseTotal); }
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new TestScore().solution();
	}
	
}
