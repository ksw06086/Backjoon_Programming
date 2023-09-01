package backjoon.problem.R20230901;

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
 * @updatedAt 김선우, 2023.09.01(문제풀이)
 * {@summary} Rectangles(N행 M열 별 추력)
 * - 입력 : 1째줄 - N, 2째줄 - M
 * https://www.acmicpc.net/problem/15232
 */
public class Rectangles {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String star = "*";
		int n = Integer.valueOf(br.readLine());
		int m = Integer.valueOf(br.readLine());
		
		
		for(int i = 0; i < n; i++) {
			sb.append(star.repeat(m) + "\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Rectangles().solution();
	}
	
}
