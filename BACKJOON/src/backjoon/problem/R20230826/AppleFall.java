package backjoon.problem.R20230826;

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
 * @category 구현
 * @updatedAt 김선우, 2023.08.26(문제풀이)
 * {@summary} 뉴턴과 사과(사과에게 맞은 사람 출력)
 * - 입력 : 1째줄 - 사람이 서있는 곳 / 2째줄 - 사과 x, y, r 
 * https://www.acmicpc.net/problem/13118
 */
public class AppleFall {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int human[] = new int[4];
		int result = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < human.length; i++) {
			human[i] = Integer.valueOf(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.valueOf(st.nextToken());
		int y = Integer.valueOf(st.nextToken());
		int z = Integer.valueOf(st.nextToken());
		
		for(int i = 0; i<human.length; i++ ) {
			if(human[i] == x) result = i+1;
		}
		
		bw.write(result + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new AppleFall().solution();
	}
	
}
