package backjoon.problem.R20230906;

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
 * @category 수학, 기하학
 * @updatedAt 김선우, 2023.09.06(문제풀이)
 * {@summary} ICPC(누가 이겼을까?)
 * - 입력 : 1째줄 - P1 E1 / 2째줄 - E2 P2
 * https://www.acmicpc.net/problem/16727
 */
public class ICPC {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer one = new StringTokenizer(br.readLine());
		StringTokenizer two = new StringTokenizer(br.readLine());
		int P1 = Integer.valueOf(one.nextToken());
		int E1 = Integer.valueOf(one.nextToken());
		int E2 = Integer.valueOf(two.nextToken());
		int P2 = Integer.valueOf(two.nextToken());
		
		if(P1+P2 > E1+E2) sb.append("Persepolis\n");
		else if(P1+P2 < E1+E2) sb.append("Esteghlal\n");
		else {
			if(E1 == P2)
				sb.append("Penalty\n");
			else {
				if(E1 < P2) sb.append("Persepolis\n");
				else sb.append("Esteghlal\n");
			}
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new ICPC().solution();
	}
	
}
