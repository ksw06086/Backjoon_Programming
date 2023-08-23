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
 * {@summary} 한글2(한글이 몇번째인지 출력)
 * 한글 가, 각, 갃 순으로 숫자가 입력된다. 아스키코드 44032부터 '가'가 시작된다.
 * - 입력 : 첫째줄 - 한글
 * https://www.acmicpc.net/problem/11283
 */
public class Hangeul2_ASCII_Code {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = br.read();
		
		bw.write((a-44031) + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Hangeul2_ASCII_Code().solution();
	}
	
}
