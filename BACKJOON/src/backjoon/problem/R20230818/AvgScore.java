package backjoon.problem.R20230818;

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
 * @category 수학, 사칙연산
 * @updatedAt 김선우, 2023.08.18(문제풀이)
 * {@summary} 평균 점수(5명의 평균 점수 구하기)
 * - 입력 : 첫째줄~다섯째줄 - 점수
 * https://www.acmicpc.net/problem/10039
 */
public class AvgScore {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int N = 5;
		int score = 0;
		int totalScore = 0;
		for(int i = 0; i<N; i++) {
			score = Integer.valueOf(br.readLine());
			totalScore += score<40?40:score;
		}
		
		bw.write(totalScore/N + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new AvgScore().solution();
	}
	
}
