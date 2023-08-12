package backjoon.problem.R20230812;

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
 * @updatedAt 김선우, 2023.08.12(문제풀이)
 * {@summary} Speed fines are not fine!(과속 검사)
 * - 입력 : 첫째줄 - 제한 속력, 둘째줄 - 나의 속력
 * https://www.acmicpc.net/problem/6763
 */
public class SpeedInspection {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int limitSpeed = Integer.valueOf(br.readLine());
		int mySpeed = Integer.valueOf(br.readLine());
		int overSpeed = mySpeed - limitSpeed;
		
		if(overSpeed <= 0) {
			sb.append("Congratulations, you are within the speed limit!");
		} else if(overSpeed <= 20){ 
			sb.append("You are speeding and your fine is $100.");
		} else if(overSpeed <= 30){ 
			sb.append("You are speeding and your fine is $270.");
		} else {
			sb.append("You are speeding and your fine is $500.");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new SpeedInspection().solution();
	}
	
}
