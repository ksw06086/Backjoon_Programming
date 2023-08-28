package backjoon.problem.R20230828;

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
 * @category 구현
 * @updatedAt 김선우, 2023.08.28(문제풀이)
 * {@summary} Tournament Selection(6개 게임 결과에 따라 들어가야할 그룹 번호)
 * - 입력 : 1째줄~6째줄 - W 또는 L
 * https://www.acmicpc.net/problem/14038
 */
public class TournamentSelection {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = 6;
		int winCnt = 0;
		int group = -1;
		
		for(int i = 0; i < N; i++) {
			String gameResult = br.readLine();
			if(gameResult.equals("W")) {
				winCnt++;
			}
		}
		
		if(winCnt > 4) { group = 1; }
		else if(winCnt > 2) { group = 2; }
		else if(winCnt > 0) { group = 3; }
		
		bw.write(group + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new TournamentSelection().solution();
	}
	
}
