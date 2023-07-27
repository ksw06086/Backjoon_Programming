package backjoon.problem.R20230727;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
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
 * @updatedAt 김선우, 2023.07.27(문제풀이)
 * {@summary} Football Scoring
 * - 입력 : 첫째줄 - 팀 득점목록별 숫자, 둘째줄 - 팀 득점목록별 숫자
 * https://www.acmicpc.net/problem/24736
 */
public class FootballScoring {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int scoreList[] = {6,3,2,1,2};
		
		bw.write(scoreSum(new StringTokenizer(br.readLine()), 0, scoreList) + " ");
		bw.write(scoreSum(new StringTokenizer(br.readLine()), 0, scoreList) + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
	
	private static int scoreSum(StringTokenizer st, int teamScore, int[] scoreList) throws IOException {
		while(st.countTokens() > 0) {
			teamScore += scoreList[5-st.countTokens()] * Integer.parseInt(st.nextToken());
		}
		return teamScore;
	}
	
	public static void main(String[] args) throws Exception {
		new FootballScoring().solution();
	}
}
