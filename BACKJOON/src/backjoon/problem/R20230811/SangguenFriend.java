package backjoon.problem.R20230811;

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
 * @updatedAt 김선우, 2023.08.11(문제풀이)
 * {@summary} 상근이의 친구들(상근이의 친구들 총 몇명?)
 * - 입력 : 첫째줄~ - 여자 수 남자 수 / 마지막줄 - 0 0
 * https://www.acmicpc.net/problem/5717
 */
public class SangguenFriend {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int man = Integer.valueOf(st.nextToken());
			int woman = Integer.valueOf(st.nextToken());
			if(man + woman == 0) { break; }
			sb.append(man + woman).append("\n");
		}
				
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new SangguenFriend().solution();
	}
	
}
