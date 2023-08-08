package backjoon.problem.R20230808;

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
 * @category 문자열, 구현
 * @updatedAt 김선우, 2023.08.08(문제풀이)
 * {@summary} Dedupe(중복을 제거하자)
 * - 입력 : 첫째줄 - 배에 탈 인원 수
 * https://www.acmicpc.net/problem/5357
 */
public class Dedupe {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.valueOf(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			String[] strArr = br.readLine().split("");
			String result = strArr[0];
			for(int s = 0; s < strArr.length - 1; s++) {
				if(strArr[s].equals(strArr[s+1])) { continue; }
				else { result += strArr[s+1]; }
			}
			sb.append(result).append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Dedupe().solution();
	}
	
}
