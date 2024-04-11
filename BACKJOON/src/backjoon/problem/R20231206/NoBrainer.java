package backjoon.problem.R20231206;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 구현
 * @updatedAt 김선우, 2023.12.06(문제풀이)
 * {@summary} Petrol(마야가 내야할 배용 금액 계산)
 * - 입력 : 1째줄 - 마야가 다음달 사용할 휘발유 양, 2째줄 - 이번 달 말 마야의 연료 카드에 남은 할당량
 * https://www.acmicpc.net/problem/18330
 */
public class NoBrainer {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.valueOf(br.readLine());
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			if(Integer.valueOf(st.nextToken()) >= Integer.valueOf(st.nextToken()))
				sb.append("MMM BRAINS\n");
			else
				sb.append("NO BRAINS\n");
		}
		 
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new NoBrainer().solution();
	}
	
}
