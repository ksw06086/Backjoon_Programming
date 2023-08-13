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
 * @category 수학, 사칙연산
 * @updatedAt 김선우, 2023.08.13(문제풀이)
 * {@summary} Body Mass Index(BMI 값으로 현재 상황 출력)
 * - 입력 : 첫째줄 - 체중, 둘째줄 - 키
 * https://www.acmicpc.net/problem/6825
 */
public class BodyMassIndex {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		double weight = Double.valueOf(br.readLine());
		double height = Double.valueOf(br.readLine());
		double BMI = weight/(height*height); 
		
		if(BMI > 25.0) {
			sb.append("Overweight").append("\n");
		} else if(BMI < 18.5) {
			sb.append("Underweight").append("\n");
		} else {
			sb.append("Normal weight").append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new BodyMassIndex().solution();
	}
	
}
