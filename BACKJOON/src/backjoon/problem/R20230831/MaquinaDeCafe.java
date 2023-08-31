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
 * {@summary} Maquina de cafe(커미머신 어디다 둘까?)
 * - 입력 : 1째줄~3째줄 - 1,2,3층 직원 수
 * https://www.acmicpc.net/problem/15051
 */
public class MaquinaDeCafe {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int oneFloor = Integer.valueOf(br.readLine());
		int twoFloor = Integer.valueOf(br.readLine());
		int threeFloor = Integer.valueOf(br.readLine()); 
		
		int res = Math.min(threeFloor*4 + twoFloor*2, 
				Math.min(oneFloor*4 + twoFloor*2, oneFloor*2 + threeFloor*2));
		
		
		bw.write(res + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new MaquinaDeCafe().solution();
	}
	
}
