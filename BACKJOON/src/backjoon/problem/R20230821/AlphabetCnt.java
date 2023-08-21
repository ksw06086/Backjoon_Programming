package backjoon.problem.R20230821;

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
 * @updatedAt 김선우, 2023.08.21(문제풀이)
 * {@summary} 알파벳 개수(알파벳이 각각 몇개 있을까?)
 * - 입력 : 첫째줄 - 문자열
 * https://www.acmicpc.net/problem/10808
 */
public class AlphabetCnt {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int alphabetIndex[] = new int[26];
		String str = br.readLine();
		for(int i = 0; i < str.length(); i++) {
			alphabetIndex[str.charAt(i)-97]++;
		}
		
		for(int i = 0; i < alphabetIndex.length; i++) {
			sb.append(alphabetIndex[i] + " ");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new AlphabetCnt().solution();
	}
	
}
