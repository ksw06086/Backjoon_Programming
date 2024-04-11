package backjoon.problem.R20240229;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Stream;

/**
 * @author swkim
 * @category 
 * @updatedAt 김선우, 2024.02.29(문제풀이)
 * {@summary} 모음의 개수
 * https://www.acmicpc.net/problem/10987
 */
public class Moum_Count {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int sum = 0;
		
		sum += str.chars().filter(c -> c == 'a').count();
		sum += str.chars().filter(c -> c == 'i').count();
		sum += str.chars().filter(c -> c == 'u').count();
		sum += str.chars().filter(c -> c == 'e').count();
		sum += str.chars().filter(c -> c == 'o').count();
		
		bw.write(sum + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Moum_Count().solution();
	}
	
}
