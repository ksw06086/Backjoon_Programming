package backjoon.problem.R20250211;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 배열 값 빈도수 비교
 * @updatedAt 김선우, 2025.02.10(문제풀이)
 * {@summary} Animal King Election
 * https://www.acmicpc.net/problem/9295
 */
public class AnimalKingElection {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String[] arr = new String[9];
		
		for(int i = 0; i < 9; i++) {
			arr[i] = br.readLine();
		}
		
		List<String> list = Arrays.asList(arr);
		if (Collections.frequency(list,"Lion") > Collections.frequency(list,"Tiger")) sb.append("Lion");
		else sb.append("Tiger");
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new AnimalKingElection().solution();
	}
	
}
