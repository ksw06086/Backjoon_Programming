package backjoon.problem.R20230814;

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
 * @category 수학, 사칙연산, 구현
 * @updatedAt 김선우, 2023.08.14(문제풀이)
 * {@summary} KNHOMAHBI(누가 무비를 더 많이 보았는가?)
 * - 입력 : 첫째줄 - Max의 트레일러, 시리즈, 영화 / 둘째줄 - Mel의 트레일러, 시리즈, 영화
 * https://www.acmicpc.net/problem/28927
 */
public class MovieMania {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer max = new StringTokenizer(br.readLine());
		StringTokenizer mel = new StringTokenizer(br.readLine());
		
		long maxWatchMinute = Integer.valueOf(max.nextToken())*3 +
							Integer.valueOf(max.nextToken())*20 +
							Integer.valueOf(max.nextToken())*120;
		long melWatchMinute = Integer.valueOf(mel.nextToken())*3 +
							Integer.valueOf(mel.nextToken())*20 +
							Integer.valueOf(mel.nextToken())*120;
		
		if(maxWatchMinute == melWatchMinute) {
			sb.append("Draw");
		} else if(maxWatchMinute > melWatchMinute) {
			sb.append("Max");
		} else {
			sb.append("Mel");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new MovieMania().solution();
	}
	
}
