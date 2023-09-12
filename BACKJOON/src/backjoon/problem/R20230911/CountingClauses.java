package backjoon.problem.R20230911;

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
 * @updatedAt 김선우, 2023.09.11(문제풀이)
 * {@summary} Counting Clauses(문제 케이스가 8개가 넘냐?)
 * - 입력 : 1째줄 - n m / 2째줄~n째줄 - a1, a2, a3
 * https://www.acmicpc.net/problem/17903
 */
public class CountingClauses {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer counts = new StringTokenizer(br.readLine());
		
		int n = Integer.valueOf(counts.nextToken());
		int m = Integer.valueOf(counts.nextToken());
		
		int nums[] = new int[n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			nums[i] = Integer.valueOf(st.nextToken())+Integer.valueOf(st.nextToken())+Integer.valueOf(st.nextToken());
		}
		String result = "";
		if(n >= 8) result = "satisfactory";
		else result = "unsatisfactory";
		
		bw.write(result + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new CountingClauses().solution();
	}
	
}
