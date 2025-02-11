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
 * @category 대각선과 직사각형 중 어떤게 더 낭비가 적을까?
 * @updatedAt 김선우, 2025.02.11(문제풀이)
 * {@summary} Cutting Corners
 * https://www.acmicpc.net/problem/19944
 */
public class CuttingCorners {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		sb.append(Math.round((w+h - Math.sqrt(w*w+h*h))*1000000000.0)/1000000000.0);
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new CuttingCorners().solution();
	}
	
}
