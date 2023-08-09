package backjoon.problem.R20230809;

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
 * @category 문자열
 * @updatedAt 김선우, 2023.08.09(문제풀이)
 * {@summary} 입실기록(픗볼 팀 이름을 잘못 작성함)
 * - 입력 : 첫째줄 - 입실 기록 수, 둘째줄~ - 입실 기록
 * https://www.acmicpc.net/problem/5524
 */
public class EntryRecord {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.valueOf(br.readLine());
		
		while(N-- > 0) {
			sb.append(br.readLine().toLowerCase()).append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new EntryRecord().solution();
	}
	
}
