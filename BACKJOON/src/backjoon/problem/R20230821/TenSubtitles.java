package backjoon.problem.R20230821;

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
 * @category 구현
 * @updatedAt 김선우, 2023.08.21(문제풀이)
 * {@summary} 10부제(자동차 일의 자리와 날짜 일의 자리 같은거 찾기)
 * - 입력 : 첫째줄 - 날짜 일의 자리 / 둘째줄 = 자동차 5대 번호 일의자리
 * https://www.acmicpc.net/problem/10797
 */
public class TenSubtitles {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String day = br.readLine();
		int violationCnt = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.countTokens() > 0) {
			if(day.equals(st.nextToken())) { violationCnt++; }
		}
		
		bw.write(violationCnt + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new TenSubtitles().solution();
	}
	
}
