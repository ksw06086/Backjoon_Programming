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
 * @category 구현, 문자열
 * @updatedAt 김선우, 2023.08.05(문제풀이)
 * {@summary} 줄번호(문자열 앞에 줄번호 함께 출력)
 * - 입력 : 첫째줄 - 문자열 개수, 둘째줄~ - 문자열
 * https://www.acmicpc.net/problem/4470
 */
public class LineNumber {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.valueOf(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			String str = br.readLine();
			sb.append(i + ". ").append(str).append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new LineNumber().solution();
	}
	
}
