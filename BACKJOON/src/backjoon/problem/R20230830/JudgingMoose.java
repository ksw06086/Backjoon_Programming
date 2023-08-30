package backjoon.problem.R20230830;

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
 * @category 수학, 구현
 * @updatedAt 김선우, 2023.08.30(문제풀이)
 * {@summary} Judging Moose(황소 무스의 뿔은 짝수, 홀수, Not 중에 무엇일까요?)
 * - 입력 : 1째줄 - 왼쪽 뿔 수, 오른쪽 뿔 수
 * https://www.acmicpc.net/problem/15025
 */
public class JudgingMoose {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int leftHorn = Integer.valueOf(st.nextToken());
		int rightHorn = Integer.valueOf(st.nextToken());
		
		if(leftHorn+rightHorn == 0) { sb.append("Not a moose"); }
		else if(leftHorn == rightHorn) { sb.append("Even " + (leftHorn*2)); }
		else { sb.append("Odd " + (Math.max(leftHorn, rightHorn)*2)); }
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new JudgingMoose().solution();
	}
	
}
