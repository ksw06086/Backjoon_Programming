package backjoon.problem.R20231207;

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

/**
 * @author swkim
 * @category 
 * @updatedAt 김선우, 2023.12.06(문제풀이)
 * {@summary} The Nearest Value
 * https://www.acmicpc.net/problem/18414
 */
public class TheNearestValue {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int arr[] = {Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken())};
		Arrays.sort(arr);
		
		if(arr[0] > N) bw.write(arr[0] + "");
		else if(arr[1] < N) bw.write(arr[1] + "");
		else bw.write(N + "");
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new TheNearestValue().solution();
	}
	
}
