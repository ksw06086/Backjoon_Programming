package backjoon.problem.R20230905;

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
 * @category 수학, 구현, 사칙연산
 * @updatedAt 김선우, 2023.09.05(문제풀이)
 * {@summary} 카드 뽑기(앞면 M개의 O, N-M개의 X / 뒷면 K개의 O, N-K개의 X / 앞뒷면이 맞는 최대 개수)
 * - 입력 : 1째줄 - N, M, K
 * https://www.acmicpc.net/problem/16204
 */
public class CardDraw {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		int result = Math.min(M, K) + Math.min(N-M, N-K);
		
		bw.write(result + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new CardDraw().solution();
	}
	
}
