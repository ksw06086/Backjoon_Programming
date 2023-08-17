package backjoon.problem.R20230817;

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
 * @updatedAt 김선우, 2023.08.17(문제풀이)
 * {@summary} Schronisko(몇 명이 방에 들어갈 수 있나?)
 * - 입력 : 첫째줄 - 테스트 케이스 / 둘째~N줄 - width, height
 * https://www.acmicpc.net/problem/8760
 */
public class Schronisko {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.valueOf(br.readLine());
		
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int w = Integer.valueOf(st.nextToken());
			int h = Integer.valueOf(st.nextToken());
			
			sb.append(w*h/2).append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Schronisko().solution();
	}
	
}
