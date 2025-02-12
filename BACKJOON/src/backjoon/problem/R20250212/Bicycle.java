package backjoon.problem.R20250212;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 계산
 * @updatedAt 김선우, 2025.02.12(문제풀이)
 * {@summary} Bicycle
 * https://www.acmicpc.net/problem/20233
 */
public class Bicycle {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		final int WOKING_DAYS = 21;
		final int A_BIKE_FREE_TIME = 30;
		final int B_BIKE_FREE_TIME = 45;
		
		int a = Integer.parseInt(br.readLine());
		int x = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int t = Integer.parseInt(br.readLine());
		
		if(t<=A_BIKE_FREE_TIME) sb.append(a);
		else sb.append((t-A_BIKE_FREE_TIME)*x*WOKING_DAYS + a);
		
		sb.append(" ");
		
		if(t<=B_BIKE_FREE_TIME) sb.append(b);
		else sb.append((t-B_BIKE_FREE_TIME)*y*WOKING_DAYS + b);
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Bicycle().solution();
	}
	
}
