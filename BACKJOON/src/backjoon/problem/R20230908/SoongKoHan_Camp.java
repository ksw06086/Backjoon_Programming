package backjoon.problem.R20230908;

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
 * @category 구현
 * @updatedAt 김선우, 2023.09.08(문제풀이)
 * {@summary} 수학은 체육과목입니다2(19번 문제 풀어라<손가락문제>)
 * - 입력 : 1째줄 - N
 * https://www.acmicpc.net/problem/17388
 */
public class SoongKoHan_Camp {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		final int UNI_CNT = 3;
		
		int participations[] = new int [UNI_CNT];
		String uniList[] = {"Soongsil", "Korea", "Hanyang"};
		int total = 0;
		for(int i = 0; i < UNI_CNT; i++) {
			participations[i] = Integer.valueOf(st.nextToken());
			total += participations[i];
		}
		String result = "";
		
		if(total >= 100) {
			result = "OK";
		} else {
			int minIndex = 0;
			for(int i = 1; i < UNI_CNT; i++) {
				if(participations[minIndex] > participations[i])
					minIndex = i;
			}
			result = uniList[minIndex];
		}
		
		bw.write(result + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new SoongKoHan_Camp().solution();
	}
	
}
