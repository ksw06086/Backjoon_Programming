package backjoon.problem.R20230804;

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
 * @category 구현, 정렬
 * @updatedAt 김선우, 2023.08.04(문제풀이)
 * {@summary} 세수정렬(세 개의 숫자 큰 수를 차례대로 정렬)
 * - 입력 : 첫째줄~ - 숫자 3개
 * https://www.acmicpc.net/problem/2752
 */
public class ThreeNumberSort {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		List<Integer> arr = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.countTokens() > 0) {
			arr.add(Integer.valueOf(st.nextToken()));
		}
		
		// 오름차순 정렬 : Comparator.naturalOrder()
		// 내림차순 정렬 : Comparator.reverseOrder()
		// 대소문자 구분없이 오름차순 정렬 : String.CASE_INSENSITIVE_ORDER
		// 대소문자 구분없이 내림차순 정렬 : Collections.reverseOrder(StringCASE_INSENSITIVE_ORDER)
		// 사용자 정의 : Comparable<자료형> class 만들어서 compareTo @Override
		arr.sort(Comparator.naturalOrder());
		
		for(int i = 0; i < arr.size(); i++) {
			sb.append(arr.get(i)).append(" ");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new ThreeNumberSort().solution();
	}
	
}
