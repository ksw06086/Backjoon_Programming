package backjoon.problem.R20230817;

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
 * @category 수학, 구현
 * @updatedAt 김선우, 2023.08.17(문제풀이)
 * {@summary} Patyki(삼각형 만들 수 있나?)
 * - 입력 : 첫째줄 - 막대기 3개의 길이
 * https://www.acmicpc.net/problem/8723
 */
public class Patyki {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int tri[] = {Integer.valueOf(st.nextToken()),
							Integer.valueOf(st.nextToken()),
							Integer.valueOf(st.nextToken())};
		
		Arrays.sort(tri);
		if(tri[0]*tri[0] + tri[1]*tri[1] == tri[2]*tri[2]) { sb.append(1); }
		else if(tri[0] == tri[2]) { sb.append(2); }
		else { sb.append(0); }
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Patyki().solution();
	}
	
}
