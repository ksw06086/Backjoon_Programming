package backjoon.problem.R20230828;

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
 * @category 구현, 수학, 사칙연산
 * @updatedAt 김선우, 2023.08.28(문제풀이)
 * {@summary} 팀 나누기(가장 작은 팀 스킬레벨 차이 값)
 * - 입력 : 1째줄 - 4명의 스킬레벨
 * https://www.acmicpc.net/problem/13866
 */
public class TeamSplit {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = 4;
		int skillLevel[] = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			skillLevel[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(skillLevel);
		int maxTeam = Math.max((skillLevel[0]+skillLevel[3]), (skillLevel[1]+skillLevel[2]));
		int minTeam = Math.min((skillLevel[0]+skillLevel[3]), (skillLevel[1]+skillLevel[2]));
		
		sb.append(maxTeam - minTeam);
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new TeamSplit().solution();
	}
	
}
