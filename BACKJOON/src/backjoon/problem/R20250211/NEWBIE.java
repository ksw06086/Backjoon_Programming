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
 * {@summary} 뉴비의 기준은 뭘까?
 * https://www.acmicpc.net/problem/19944
 */
public class NEWBIE {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		
		if (m == 1 || m == 2) sb.append("NEWBIE!");
		else if (m <= n) sb.append("OLDBIE!");
		else sb.append("TLE!");
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new NEWBIE().solution();
	}
	
}
