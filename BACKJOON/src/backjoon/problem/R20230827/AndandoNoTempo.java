package backjoon.problem.R20230827;

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
 * @updatedAt 김선우, 2023.08.27(문제풀이)
 * {@summary} Andando no tempo(시간여행 다시 돌아올 수 있나?)
 * - 입력 : 1째줄 - 3개의 시간여행 년도 수
 * https://www.acmicpc.net/problem/13580
 */
public class AndandoNoTempo {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String result = "";
		int arr[] = new int[3];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.valueOf(st.nextToken()); 
		}
		Arrays.sort(arr);
		
		if(arr[0] == arr[1]|| arr[1] == arr[2] || arr[0] == arr[2]) {
			result = "S";
		} else if(arr[0]+arr[1] == arr[2]) {
			result = "S";
		} else {
			result = "N";
		}
		
		bw.write(result + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new AndandoNoTempo().solution();
	}
	
}
