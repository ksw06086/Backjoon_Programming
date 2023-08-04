package backjoon.problem.R20230725;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.25
 * 최초 변경일 : 2023.07.25
 * 목적 : 23235번 - The Fastest Sorting Algorithm In The World(정렬 알고리즘)
 * 개정 이력 : 김선우, 2023.07.25(문제풀이)
 * 저작권 : 김선우
 */
public class SortingAlgorithm {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int cnt = 1;
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			if(n == 0) { break; }
			List<Integer> arr = new ArrayList<Integer>();
			while(n-- > 0) {
				arr.add(Integer.parseInt(st.nextToken()));
			}
			sb.append("Case " + cnt++ + ": Sorting... done!").append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new SortingAlgorithm().solution();
	}
}