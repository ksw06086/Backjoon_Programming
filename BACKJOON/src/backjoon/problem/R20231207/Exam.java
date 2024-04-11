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
 * {@summary} Exam
 * https://www.acmicpc.net/problem/18411
 */
public class Exam {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> arr = new ArrayList<Integer>(); 
		
		while(st.countTokens() > 0) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(arr, Collections.reverseOrder());
		
		bw.write((arr.get(0) + arr.get(1)) + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Exam().solution();
	}
	
}
