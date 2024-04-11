package backjoon.problem.R20231208;

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
 * @updatedAt 김선우, 2023.12.08(문제풀이)
 * {@summary} Pokemon Buddy
 * https://www.acmicpc.net/problem/18691
 */
public class PokemonBuddy {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.valueOf(br.readLine());
		
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int g = Integer.valueOf(st.nextToken());
			int c = Integer.valueOf(st.nextToken());
			int e = Integer.valueOf(st.nextToken());
			
			if((e-c) <= 0) {
				sb.append(0).append("\n");
			} else {
				sb.append((int) Math.ceil((e-c)*((g-1)*2.0+1))).append("\n");
			}
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new PokemonBuddy().solution();
	}
	
}
