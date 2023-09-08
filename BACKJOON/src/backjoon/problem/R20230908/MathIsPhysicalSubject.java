package backjoon.problem.R20230908;

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
 * @updatedAt 김선우, 2023.09.08(문제풀이)
 * {@summary} 수학은 체육과목입니다2(19번 문제 풀어라<손가락문제>)
 * - 입력 : 1째줄 - N
 * https://www.acmicpc.net/problem/17362
 */
public class MathIsPhysicalSubject {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.valueOf(br.readLine());
		int result = 0;
		
		if(n%8 == 0) result = 2;
		else if(n%8 == 7) result = 3;
		else if(n%8 == 6) result = 4;
		else result = n%8;
		
		bw.write(result + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new MathIsPhysicalSubject().solution();
	}
	
}
