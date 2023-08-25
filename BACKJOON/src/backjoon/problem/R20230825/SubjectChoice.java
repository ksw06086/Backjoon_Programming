package backjoon.problem.R20230825;

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
 * @category 구현, 수학, 사칙연산
 * @updatedAt 김선우, 2023.08.25(문제풀이)
 * {@summary} 과목선택(6과목 중 4과목 선택해서 가장 높은 점수)
 * - 입력 : 1째줄~6째줄 - 과목 점수 
 * https://www.acmicpc.net/problem/11948
 */
public class SubjectChoice {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Integer scienceScores[] = new Integer[4];
		Integer societyScores[] = new Integer[2];
		
		for(int i = 0; i < scienceScores.length; i++) {
			scienceScores[i] = Integer.valueOf(br.readLine());
		}
		for (int i = 0; i < societyScores.length; i++) {
			societyScores[i] = Integer.valueOf(br.readLine());
		}
		Arrays.sort(scienceScores, Collections.reverseOrder());
		Arrays.sort(societyScores, Collections.reverseOrder());
		
		int result = scienceScores[0] + scienceScores[1] + scienceScores[2] + societyScores[0];
		
		bw.write(result + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new SubjectChoice().solution();
	}
	
}
