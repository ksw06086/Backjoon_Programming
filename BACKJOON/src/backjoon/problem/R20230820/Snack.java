package backjoon.problem.R20230820;

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
 * @category 구현, 기하학
 * @updatedAt 김선우, 2023.08.20(문제풀이)
 * {@summary} 과자(부모님께 받아야 하는 돈 출력)
 * - 입력 : 첫째줄~ - 과자1개당 가격, 과자개수, 받은 돈 
 * https://www.acmicpc.net/problem/10156
 */
public class Snack {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int snackPrice = Integer.valueOf(st.nextToken());
		int snackCount = Integer.valueOf(st.nextToken());
		int myMoney = Integer.valueOf(st.nextToken());
		
		int needMoney = snackPrice*snackCount-myMoney;
		if(needMoney < 0) { sb.append(0); }
		else { sb.append(needMoney); }
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Snack().solution();
	}
	
}
