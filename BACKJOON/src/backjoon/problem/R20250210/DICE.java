package backjoon.problem.R20250210;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 
 * @updatedAt 김선우, 2025.02.10(문제풀이)
 * {@summary} 주사위
 * https://www.acmicpc.net/problem/9295
 */
public class DICE {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			sb.append("Case ").append(i).append(": ").append(Integer.valueOf(st.nextToken()) + Integer.valueOf(st.nextToken())).append("\n");
			
		}
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new DICE().solution();
	}
	
}
