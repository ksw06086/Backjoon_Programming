package backjoon.problem.R20230830;

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
 * @category 수학, 사칙연산
 * @updatedAt 김선우, 2023.08.30(문제풀이)
 * {@summary} 폰 노이만과 파리(두 기차가 만났을 때까지 파리가 움직인 거리)
 * - 입력 : 1째줄 - 기차 속도, 파리 속도, 두 기차 거리
 * https://www.acmicpc.net/problem/14924
 */
public class PonNoimanAndFly {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int trainSpeed = Integer.valueOf(st.nextToken());
		int flySpeed = Integer.valueOf(st.nextToken());
		int street = Integer.valueOf(st.nextToken());
		
		int result = (street/(trainSpeed*2)) * flySpeed;
		
		bw.write(result + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new PonNoimanAndFly().solution();
	}
	
}
