package backjoon.problem.R20230905;

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
 * @updatedAt 김선우, 2023.09.05(문제풀이)
 * {@summary} 운동장 한 바퀴(운동장 둘레의 길이를 구하시오)
 * - 입력 : 1째줄 - 가운데 직사강형 가로 길이 / 2째줄 - 반원의 반지름
 * https://www.acmicpc.net/problem/16486
 */
public class PlaygroundAround {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		double PI = 3.141592;
		
		double width = Double.valueOf(br.readLine());
		double r = Double.valueOf(br.readLine()) * 2;
		
		double rectangle = width * 2;
		double circle = r * PI;
		
		bw.write((rectangle + circle) + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new PlaygroundAround().solution();
	}
	
}
