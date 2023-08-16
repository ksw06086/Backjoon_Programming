package backjoon.problem.R20230816;

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
 * @updatedAt 김선우, 2023.08.16(문제풀이)
 * {@summary} Koszykarz(얼마나 머리에 충동을 일으켜야 할까?)
 * - 입력 : 첫째줄 - 나의 키, 원하는 키, 충돌마다 커지는 키
 * https://www.acmicpc.net/problem/8710
 */
public class Koszykarz {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int myHeight = Integer.valueOf(st.nextToken());
		int wantHeight = Integer.valueOf(st.nextToken());
		int needHeight = wantHeight - myHeight;
		int crashHeight = Integer.valueOf(st.nextToken());
		
		int crashCnt = (int) Math.ceil(needHeight/(crashHeight*1.0));
		
		bw.write(crashCnt + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Koszykarz().solution();
	}
	
}
