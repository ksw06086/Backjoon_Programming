package backjoon.problem.R20230907;

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
 * @category 수학, 구현, 사칙연산
 * @updatedAt 김선우, 2023.09.07(문제풀이)
 * {@summary} Winning Score(누가 이겼을까?)
 * - 입력 : 1째줄~3째줄 - Apple의 3점, 2점, 1점 횟수 / 4째줄~6째줄 - Banana의 3점, 2점, 1점 횟수   
 * https://www.acmicpc.net/problem/17009
 */
public class WinningScore {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int SCORE_TYPE = 3;
		int appleScore = 0;
		int bananaScore = 0;
		String result;
		
		for(int i = SCORE_TYPE; i > 0; i--)
			appleScore += Integer.valueOf(br.readLine())*i;
		for(int i = SCORE_TYPE; i > 0; i--)
			bananaScore += Integer.valueOf(br.readLine())*i;	
		
		if(appleScore == bananaScore) result = "T";
		else if(appleScore > bananaScore) result = "A";
		else result = "B";
		
		
		bw.write(result + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new WinningScore().solution();
	}
	
}
