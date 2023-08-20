package backjoon.problem.R20230820;

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
 * @category 구현
 * @updatedAt 김선우, 2023.08.20(문제풀이)
 * {@summary} Quadrilateral(X로된 사각형 출력)
 * - 입력 : 첫째줄 - 테스트 케이스 / 둘째줄~ - 길이, 너비  
 * https://www.acmicpc.net/problem/10188
 */
public class Quadrilateral {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.valueOf(br.readLine());
		
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int w = Integer.valueOf(st.nextToken());
			int h = Integer.valueOf(st.nextToken());
			String str = "X";
			
			for(int i = 0; i < h; i++) {
				sb.append(str.repeat(w)).append("\n");
			}
			sb.append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Quadrilateral().solution();
	}
	
}
