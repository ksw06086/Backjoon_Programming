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
 * @category 구현, 문자열, 애드 혹
 * @updatedAt 김선우, 2023.08.05(문제풀이)
 * {@summary} Celebrity jeopardy(방정식 출력)
 * - 입력 : 첫째줄~ - 방정식
 * https://www.acmicpc.net/problem/3765
 */
public class CelebrityJeopardy {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String str = br.readLine();
			if(str == null) { break; }
			sb.append(str).append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new CelebrityJeopardy().solution();
	}
	
}
