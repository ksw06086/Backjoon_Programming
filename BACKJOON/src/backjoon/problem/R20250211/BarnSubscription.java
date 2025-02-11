package backjoon.problem.R20250211;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 직사각형 안에 정사각형 몇개 들어가냐?
 * @updatedAt 김선우, 2025.02.11(문제풀이)
 * {@summary} 헛간 청약
 * https://www.acmicpc.net/problem/19698
 */
public class BarnSubscription {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int width = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());
		int line = Integer.parseInt(st.nextToken());
		
		
		if ((width / line) * (height / line) > n) sb.append(n);
		else sb.append((width / line) * (height / line));
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new BarnSubscription().solution();
	}
	
}
