package backjoon.problem.R20230831;

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
 * @category 수학, 사칙연산, 구현
 * @updatedAt 김선우, 2023.08.31(문제풀이)
 * {@summary} Hard choice(기내식 못먹는 사람 몇명?)
 * - 입력 : 1째줄 - 각 음식 수 / 2째줄 - 각 주문 수 
 * https://www.acmicpc.net/problem/15059
 */
public class HardChoice {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer menulist = new StringTokenizer(br.readLine());
		StringTokenizer orderlist = new StringTokenizer(br.readLine());
		
		int remainCnt = 0;
		while(menulist.countTokens() > 0) {
			int menuCnt = Integer.valueOf(menulist.nextToken());
			int orderCnt = Integer.valueOf(orderlist.nextToken());
			if(menuCnt >= orderCnt) { remainCnt += 0; }
			else { remainCnt += orderCnt - menuCnt; }
		}
		
		bw.write(remainCnt + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new HardChoice().solution();
	}
	
}
