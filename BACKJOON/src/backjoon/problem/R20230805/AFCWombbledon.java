package backjoon.problem.R20230805;

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
 * @updatedAt 김선우, 2023.08.05(문제풀이)
 * {@summary} AFC 웜블던(두 팀의 점수 출력)
 * - 입력 : 첫째줄~ - 두 팀의 점수 합과 차
 * https://www.acmicpc.net/problem/4299
 */
public class AFCWombbledon {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int scoreTotal = Integer.valueOf(st.nextToken());
		int scoreSub = Integer.valueOf(st.nextToken());
		
		if(scoreTotal < scoreSub || (scoreTotal+scoreSub)%2 == 1) {
			sb.append(-1);
		} else { 
			sb.append((scoreTotal+scoreSub)/2).append(" ").append((scoreTotal+scoreSub)/2 - scoreSub); 
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new AFCWombbledon().solution();
	}
	
}
