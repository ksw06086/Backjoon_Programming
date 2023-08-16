package backjoon.problem.R20230816;

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
 * @category 수학, 사칙연산
 * @updatedAt 김선우, 2023.08.16(문제풀이)
 * {@summary} Silnia(팩토리얼 1의 자리 수 출력)
 * - 입력 : 첫째줄 - N
 * https://www.acmicpc.net/problem/8558
 */
public class Silnia {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.valueOf(br.readLine());
		int result = 1;
		
		for(int i = 2; i <= N; i++) {
			result = (result * i)%10;
		}
		
		bw.write(result + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Silnia().solution();
	}
	
}
