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
 * @category 계산
 * @updatedAt 김선우, 2025.02.11(문제풀이)
 * {@summary} Dog Treats
 * https://www.acmicpc.net/problem/19602
 */
public class DogTreats {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		
		int small = Integer.parseInt(br.readLine());
		int medium = Integer.parseInt(br.readLine());
		int large = Integer.parseInt(br.readLine());
		
		
		if (small + medium*2 + large*3 >= 10) sb.append("happy");
		else sb.append("sad");
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new DogTreats().solution();
	}
	
}
