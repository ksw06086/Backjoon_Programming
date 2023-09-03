package backjoon.problem.R20230903;

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
 * @category 수학, 사칙연산, 많은 조건 분기
 * @updatedAt 김선우, 2023.09.03(문제풀이)
 * {@summary} 공백 없는 A+B(공백 없이 두 숫자가 입력 되었을 때 두 수를 더하기)
 * - 입력 : 1째줄 - 공백없는 두 수
 * https://www.acmicpc.net/problem/15873
 */
public class PlusWithoutSpaces {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.valueOf(br.readLine());
		int sum = 0;
		
		while(n > 0) {
			if(n%10 == 0) {
				sum += n%100; n /= 100;
			} else {
				sum += n%10; n /= 10;
			}
		}
		
		bw.write(sum + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new PlusWithoutSpaces().solution();
	}
	
}
