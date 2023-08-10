package backjoon.problem.R20230810;

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
 * @updatedAt 김선우, 2023.08.10(문제풀이)
 * {@summary} 상근날드(가장 싼 세트 메뉴의 가격 출력)
 * - 입력 : 첫째줄~ - 상덕버거, 중덕버거, 하덕버거, 콜라, 사이다 가격
 * https://www.acmicpc.net/problem/5543
 */
public class SangguenNard {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		List<Integer> burgerPriceList = new ArrayList<Integer>();
		burgerPriceList.add(Integer.valueOf(br.readLine())); // Sburger
		burgerPriceList.add(Integer.valueOf(br.readLine())); // Jburger
		burgerPriceList.add(Integer.valueOf(br.readLine())); // Hburger
		List<Integer> juicePriceList = new ArrayList<Integer>();
		juicePriceList.add(Integer.valueOf(br.readLine()));  // Cola
		juicePriceList.add(Integer.valueOf(br.readLine()));  // Sidar
		
		burgerPriceList.sort(Comparator.naturalOrder());
		juicePriceList.sort(Comparator.naturalOrder());
		sb.append(burgerPriceList.get(0) + juicePriceList.get(0) - 50);
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new SangguenNard().solution();
	}
	
}
