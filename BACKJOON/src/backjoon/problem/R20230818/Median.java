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
 * @category 수학, 구현
 * @updatedAt 김선우, 2023.08.18(문제풀이)
 * {@summary} Median(중앙값 찾기)
 * - 입력 : 첫째줄~ - 수 갯수, 수1,...수n / 마지막 - 0
 * https://www.acmicpc.net/problem/9782
 */
public class Median {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int caseNum = 1;
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			if(N == 0) break;
			
			int numArr[] = new int[N];
			for (int i = 0; i < N; i++) {
				numArr[i] = Integer.valueOf(st.nextToken());
			}
			
			sb.append("Case " + caseNum++ + ": ");
			if(N%2 == 1) { sb.append(String.format("%.01f", (numArr[(N)/2]*1.0))).append("\n"); }
			else { sb.append(String.format("%.01f", (numArr[(N-1)/2] + numArr[(N)/2])/(2*1.0))).append("\n"); }
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Median().solution();
	}
	
}
