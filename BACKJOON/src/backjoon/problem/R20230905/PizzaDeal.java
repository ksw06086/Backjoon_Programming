package backjoon.problem.R20230905;

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
 * @category 수학, 구현, 사칙연산, 기하학
 * @updatedAt 김선우, 2023.09.05(문제풀이)
 * {@summary} Pizza Deal(뭐가 더 쌀까?)
 * - 입력 : 1째줄 - 한조각 넓이, 한조각 가격 / 2째줄 - 전체 반지름, 전체 가격
 * https://www.acmicpc.net/problem/16693
 */
public class PizzaDeal {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer one = new StringTokenizer(br.readLine());
		StringTokenizer whole = new StringTokenizer(br.readLine());
		
		double a = Double.parseDouble(one.nextToken());
		double p = Double.parseDouble(one.nextToken());
		double r = Double.parseDouble(whole.nextToken());
		double q = Double.parseDouble(whole.nextToken());
		
		String res = "";
		if((a/p) < (Math.PI*r*r/q)) res = "Whole pizza";
		else res = "Slice of pizza";
		
		bw.write(res + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new PizzaDeal().solution();
	}
	
}
