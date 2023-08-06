package backjoon.problem.R20230806;

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
 * @category 수학, 사칙연산
 * @updatedAt 김선우, 2023.08.06(문제풀이)
 * {@summary} St. lves(아내의 수에 따라 자루, 고양이, 새끼 고양이가 제곱으로 증가함. 총 개수)
 * - 입력 : 첫째줄~ - 만난 아내 수, 마지막줄 - 0
 * https://www.acmicpc.net/problem/4696
 */
public class St_lves {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			double n = Double.valueOf(br.readLine());
			if(n == 0.0) { break; }
			sb.append(String.format("%.2f", 1 + n + n*n + n*n*n + n*n*n*n)).append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new St_lves().solution();
	}
	
}
