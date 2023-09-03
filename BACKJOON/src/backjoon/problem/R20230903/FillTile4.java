package backjoon.problem.R20230903;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 수학, 사칙연산
 * @updatedAt 김선우, 2023.09.03(문제풀이)
 * {@summary} 타일 채우기 4(벽에 들어갈 타일의 개수)
 * - 입력 : 1째줄 - 벽 크기 N, M
 * https://www.acmicpc.net/problem/15700
 */
public class FillTile4 {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long N = Long.valueOf(st.nextToken());
		long M = Long.valueOf(st.nextToken());
		long heightTileCnt = N*(M/2);
		long widthTileCnt = (M%2)*(N/2);
		
		bw.write(heightTileCnt + widthTileCnt + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new FillTile4().solution();
	}
	
}
