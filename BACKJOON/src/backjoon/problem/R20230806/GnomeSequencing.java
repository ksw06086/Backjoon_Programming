package backjoon.problem.R20230806;

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
 * @category 구현
 * @updatedAt 김선우, 2023.08.06(문제풀이)
 * {@summary} Gnome Sequencing(정렬된 리스트인지 여부 출력)
 * - 입력 : 첫째줄 - 테스트 횟수, 둘째줄~ - 3개의 수로 나열된 문자열
 * https://www.acmicpc.net/problem/4589
 */
public class GnomeSequencing {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.valueOf(br.readLine());
		sb.append("Gnomes:").append("\n");
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			sb.append(quickSort(st)).append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static String quickSort(StringTokenizer st) {
		short startSortType = 0;
		int firstNum = Integer.valueOf(st.nextToken());
		int standardNum = Integer.valueOf(st.nextToken());
		if (firstNum > standardNum) { startSortType = 1; }
		else { startSortType = -1; }
		
		while(st.countTokens() > 0) {
			int compareNum = Integer.valueOf(st.nextToken());
			if(startSortType == 0) { 
				if (standardNum > compareNum) { startSortType = 1; }
				else if (standardNum < compareNum) { startSortType = -1; }
			} else if(startSortType == 1) {
				if (standardNum < compareNum) { 
					return "Unordered";
				}
			} else if(startSortType == -1) {
				if (standardNum > compareNum) {
					return "Unordered";
				}
			}
			standardNum = compareNum;
		}
		return "Ordered";
	}
	
	public static void main(String[] args) throws Exception {
		new GnomeSequencing().solution();
	}
	
}
