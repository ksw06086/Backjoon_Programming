package backjoon.problem.R20230912;

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
 * @category 구현, 문자열
 * @updatedAt 김선우, 2023.09.12(문제풀이)
 * {@summary} Basketball One-on-One(문자열로 주는 게임 결과 점수 계산해서 승리자 구하기)
 * - 입력 : 1째줄 - 각 게임 팀별 점수를 하나의 문자열로 입력받음
 * https://www.acmicpc.net/problem/18198
 */
public class BasketballOneonOne {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		char winTeam = 'C';
		int AScore = 0;
		int BScore = 0;
		
		for(int i = 0; i < str.length(); i+=2) {
			if(str.charAt(i) == 'A') {
				AScore += Integer.valueOf(str.charAt(i+1));
			} 
			if(str.charAt(i) == 'B') {
				BScore += Integer.valueOf(str.charAt(i+1));
			}
			
			// 점수 비교
            if (AScore > 10 || BScore > 10) {

                if (AScore - 1 != BScore && BScore - 1 != AScore) {
                    if (AScore < BScore) {
                    	winTeam = 'B';
                    } else if (AScore > BScore) {
                    	winTeam = 'A';
                    }
                }
            }
		}
		
		bw.write(winTeam + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new BasketballOneonOne().solution();
	}
	
}
