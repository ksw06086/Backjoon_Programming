package backjoon.problem.R20231207;

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
 * @category 
 * @updatedAt 김선우, 2023.12.06(문제풀이)
 * {@summary} Three Integers(마야가 내야할 배용 금액 계산)
 * - 입력 : 1째줄 - 마야가 다음달 사용할 휘발유 양, 2째줄 - 이번 달 말 마야의 연료 카드에 남은 할당량
 * https://www.acmicpc.net/problem/18408
 */
public class ThreeIntegers {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n[][] = {{1, 2}, {0, 0}};
		
		while(st.countTokens() > 0) {
			if(n[0][0] == Integer.parseInt(st.nextToken()))
				n[1][0] += 1;
			else
				n[1][1] += 1;
		}
		
		bw.write((n[1][0] > n[1][1] ? n[0][0] : n[0][1]) + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new ThreeIntegers().solution();
	}
	
}
