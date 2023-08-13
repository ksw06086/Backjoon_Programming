package backjoon.problem.R20230813;

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
 * @category 수학, 구현, 사칙연산
 * @updatedAt 김선우, 2023.08.13(문제풀이)
 * {@summary} ISBN(ISBN 13자리 수 값 출력)
 * - 입력 : 첫째줄~셋째줄 - ISBN의 마지막 3자리
 * https://www.acmicpc.net/problem/6810
 */
public class ISBN {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int result = 0;
		int[] array = {1, 3};
		int[] code = {9,7,8,0,9, 2,1,4,1,8, 0,0,0};
		for(int i = 0; i < 3; i++) {
			code[10 + i] = Integer.valueOf(br.readLine());
		}
		
		for(int i = 0; i < code.length; i++) {
			result += code[i] * array[i%2];
		}
		
		bw.write("The 1-3-sum is " + result + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new ISBN().solution();
	}
	
}
