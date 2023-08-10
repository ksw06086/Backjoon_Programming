package backjoon.problem.R20230810;

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
 * @category 수학, 사칙연산, 구현
 * @updatedAt 김선우, 2023.08.10(문제풀이)
 * {@summary} 심부름 가는 길(학교 -> PC방 -> 학원 -> 집 시간 구하기)
 * - 입력 : 첫째줄 - 집->학교, 둘째줄 - 학교->PC방, 셋째줄 - PC방->학원, 넷째줄 - 학원->집
 * https://www.acmicpc.net/problem/5554
 */
public class MoveTime {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int totalSecond = Integer.valueOf(br.readLine()) + 
							Integer.valueOf(br.readLine()) +
							Integer.valueOf(br.readLine()) +
							Integer.valueOf(br.readLine());
		
		sb.append(totalSecond/60).append("\n").append(totalSecond%60);
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new MoveTime().solution();
	}
	
}
