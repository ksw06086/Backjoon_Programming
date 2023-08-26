package backjoon.problem.R20230826;

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
 * @category 수학 사칙연산
 * @updatedAt 김선우, 2023.08.26(문제풀이)
 * {@summary} The Merchant of Venice(선박의 물건 기간안에 몇개 올 수 있는가?)
 * - 입력 : 1째줄 - K(테스트 케이스) / 2째줄 - 선박개수,일일속도,남은기한 / 3째줄 - 선박별거리, 물건수 
 * https://www.acmicpc.net/problem/13496
 */
public class TheMerchantOfVenice {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int K = Integer.valueOf(br.readLine());
		
		for(int i = 1; i <= K; i++) {
			StringTokenizer dataset = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(dataset.nextToken());
			int speed = Integer.valueOf(dataset.nextToken());
			int deadline = Integer.valueOf(dataset.nextToken());
			
			int result = 0;
			sb.append("Data Set " + i + ":\n");
			for(int j = 0; j<n; j++) {
				StringTokenizer boat = new StringTokenizer(br.readLine());
				int street = Integer.valueOf(boat.nextToken());
				int load = Integer.valueOf(boat.nextToken());
				if(street <= speed*deadline) result += load;
			}
			sb.append(result + "\n\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new TheMerchantOfVenice().solution();
	}
	
}
