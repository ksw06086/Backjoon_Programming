package backjoon.problem.R20230829;

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
 * @updatedAt 김선우, 2023.08.29(문제풀이)
 * {@summary} Gorivo(100km 당 사용되는 연로 L)
 * - 입력 : 1째줄 - 갤런 당 마일 수
 * https://www.acmicpc.net/problem/14065
 */
public class Gorivo {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		double gallon = 3.785411784;
		double mile = Double.valueOf(br.readLine());
		double result = 100/(mile*1.609344);
		
		bw.write(String.format("%.6f", gallon*result) + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Gorivo().solution();
	}
	
}
