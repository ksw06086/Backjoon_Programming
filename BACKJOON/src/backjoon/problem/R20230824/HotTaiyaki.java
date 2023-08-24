package backjoon.problem.R20230824;

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
 * @category 구현, 문자열
 * @updatedAt 김선우, 2023.08.24(문제풀이)
 * {@summary} 뜨거운 붕어빵(음미해서 티의 번호 정답을 맞춘 사람이 몇명인가여)
 * - 입력 : 첫째줄 - 정답의 티 번호 / 둘째줄 - 5명이 말한 정답
 * https://www.acmicpc.net/problem/11945
 */
public class HotTaiyaki {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.valueOf(st.nextToken());
		int w = Integer.valueOf(st.nextToken());
		
		for(int i = 0; i < h; i++) {
			StringBuilder reverse = new StringBuilder(br.readLine());
			sb.append(reverse.reverse()).append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new HotTaiyaki().solution();
	}
	
}
