package backjoon.problem.R20231218;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 
 * @updatedAt 김선우, 2023.12.18(문제풀이)
 * {@summary} Time to Decompress
 * https://www.acmicpc.net/problem/17010
 */
public class TimeToDecompress {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.valueOf(br.readLine());
		
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cnt = Integer.valueOf(st.nextToken());
			String str = st.nextToken();
			
			sb.append(str.repeat(cnt)).append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new TimeToDecompress().solution();
	}
	
}
