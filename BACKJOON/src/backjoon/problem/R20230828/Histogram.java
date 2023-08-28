package backjoon.problem.R20230828;

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
 * @updatedAt 김선우, 2023.08.28(문제풀이)
 * {@summary} 히스토그램(막대기 출력)
 * - 입력 : 1째줄 - N / 2째줄~N째줄 - 막대개수
 * https://www.acmicpc.net/problem/13752
 */
public class Histogram {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.valueOf(br.readLine());
		
		String line = "=";
		while(N-- > 0) {
			int lineCnt = Integer.valueOf(br.readLine());
			sb.append(line.repeat(lineCnt)).append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Histogram().solution();
	}
	
}
