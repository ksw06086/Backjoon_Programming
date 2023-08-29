package backjoon.problem.R20230829;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 수학, 사칙연산, 구현, 시뮬레이션
 * @updatedAt 김선우, 2023.08.29(문제풀이)
 * {@summary} 전자레인지(N도 까지 걸리는 초)
 * - 입력 : 1째줄~5째줄 - 식품온도, 원하는온도, 0도 전 1도 올리는 시간, 해동시간, 1도 데우는 시간
 * https://www.acmicpc.net/problem/14470
 */
public class Microwave {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int result = 0;
		
		// 입력
		int startState = Integer.valueOf(br.readLine());
		int endState = Integer.valueOf(br.readLine());
		int freezeMinute = Integer.valueOf(br.readLine());
		int defrostMinute = Integer.valueOf(br.readLine());
		int warmUpMinute = Integer.valueOf(br.readLine());
		
		if(startState < 0) {
			result += freezeMinute * Math.abs(startState);
			startState = 0;
		}
		if(startState == 0) { result += defrostMinute; }
		if(startState > 0) { result -= startState*warmUpMinute; }
		result += warmUpMinute * endState;
		
		bw.write(result + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Microwave().solution();
	}
	
}
