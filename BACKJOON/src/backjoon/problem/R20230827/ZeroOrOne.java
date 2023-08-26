package backjoon.problem.R20230827;

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
 * @updatedAt 김선우, 2023.08.27(문제풀이)
 * {@summary} Zero or One(1명만 0,1 중 다르면 그 사람이 이김)
 * - 입력 : 1째줄 - 3명이 0과 1 중에 뽑은 값들
 * https://www.acmicpc.net/problem/13623
 */
public class ZeroOrOne {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		int c = Integer.valueOf(st.nextToken());
		String result = "";
		
		if(a == b && b == c) { result = "*"; }
		else if(a == b) { result = "C"; }
		else if(a == c) { result = "B"; }
		else if(b == c) { result = "A"; }
		
		bw.write(result + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new ZeroOrOne().solution();
	}
	
}
