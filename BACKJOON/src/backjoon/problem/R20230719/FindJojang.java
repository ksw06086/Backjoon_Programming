package backjoon.problem.R20230719;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.19
 * 최초 변경일 : 2023.07.19
 * 목적 : 15727번 - 조별과제를 하려는데 조장이 사라졌다.(조장의 집까지 몇번만에 도착할지 출력)
 * 개정 이력 : 김선우, 2023.07.19(문제풀이)
 * 저작권 : 김선우
 */
public class FindJojang {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		
		
		if(input%5 == 0) { input /= 5; }
		else { input = input/5 + 1; }
		bw.write(input + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new FindJojang().solution();
	}
}