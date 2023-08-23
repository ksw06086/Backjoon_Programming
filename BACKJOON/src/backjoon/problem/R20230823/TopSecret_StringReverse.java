package backjoon.problem.R20230823;

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
 * @category 구현, 문자열
 * @updatedAt 김선우, 2023.08.23(문제풀이)
 * {@summary} !밀비 급일(암호 거꾸로 하면 해독이 됨)
 * - 입력 : 첫째줄~ - 암호 / 마지막 - END
 * https://www.acmicpc.net/problem/11365
 */
public class TopSecret_StringReverse {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String amho = br.readLine();
			if(amho.equals("END")) break;
			StringBuilder reverse = new StringBuilder(amho);
			reverse = reverse.reverse();
			sb.append(reverse + "\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new TopSecret_StringReverse().solution();
	}
	
}
