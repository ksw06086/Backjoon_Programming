package backjoon.problem.R20230726;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 구현, 시뮬레이션
 * @updatedAt 김선우, 2023.07.26(문제풀이)
 * {@summary}
 * - 첫째줄 : 코드1의 수행 횟수 출력
 * - 둘째줄 : 알고리즘 수행시간이 상수 시간 - 0, n에 비례 - 1, n2에 비례 - 2, n3에 비례 - 3, n3보다 큰 시간에 비례 - 4
 * https://www.acmicpc.net/problem/24262
 * 알고리즘 수업 - 알고리즘의 수행 시간 1(알고리즘 수행 시간 출력)
 */
public class AlgorithmStudy1 {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		bw.write(1 + "\n" + 0);
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new AlgorithmStudy1().solution();
	}
}