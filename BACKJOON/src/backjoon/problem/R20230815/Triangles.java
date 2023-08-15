package backjoon.problem.R20230815;

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
 * @category 구현
 * @updatedAt 김선우, 2023.08.15(문제풀이)
 * {@summary} Triangles(삼각형 그리기)
 * - 입력 : 첫째줄~ - 삼각형 크기 / 마지막줄 - 0
 * https://www.acmicpc.net/problem/7595
 */
public class Triangles {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String STAR = "*";
		while(true) {
			int N = Integer.valueOf(br.readLine());
			if(N == 0) break;
			for(int i = 1; i <= N; i++)
				sb.append(STAR.repeat(i)).append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Triangles().solution();
	}
	
}
