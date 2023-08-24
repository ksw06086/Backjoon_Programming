package backjoon.problem.R20230824;

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
 * @category 구현, 수학
 * @updatedAt 김선우, 2023.08.24(문제풀이)
 * {@summary} 파일 옮기기(사과와 오렌지를 따로 둘 수 있는 바구니 옮김 최소 횟수)
 * - 입력 : 첫째줄 - 한 바구니의 사과와 오렌지 개수 / 둘째줄 - 한 바구니의 사과와 오렌지 개수
 * https://www.acmicpc.net/problem/11943
 */
public class FileMove {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer basket = new StringTokenizer(br.readLine());
		int firstApple = Integer.valueOf(basket.nextToken());
		int firstOrange = Integer.valueOf(basket.nextToken());
		basket = new StringTokenizer(br.readLine());
		int secondApple = Integer.valueOf(basket.nextToken());
		int secondOrange = Integer.valueOf(basket.nextToken());
		
		if(firstApple + secondOrange < firstOrange + secondApple) {
			sb.append((firstApple + secondOrange) + "\n");
		} else {
			sb.append((secondApple + firstOrange) + "\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new FileMove().solution();
	}
	
}
