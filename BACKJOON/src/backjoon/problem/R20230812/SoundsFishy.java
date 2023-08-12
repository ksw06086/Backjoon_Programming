package backjoon.problem.R20230812;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 구현
 * @updatedAt 김선우, 2023.08.12(문제풀이)
 * {@summary} Sounds fishy(시퀀스 증가, 감소, 동일, 예외 처리)
 * - 입력 : 첫째줄~넷째줄 - 시퀀스 값
 * https://www.acmicpc.net/problem/6764
 */
public class SoundsFishy {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = 4;
		String resultStr[] = {"Fish At Constant Depth", "Fish Rising", "Fish Diving", "No Fish"};
		
		// 0: Fish At Constant Depth 
		// 1: Fish Rising
		// 2: Fish Diving
		// 3: No Fish
		int switchNum = 0; 
		int sequences[] = new int[N];
		for(int i = 0; i < N; i++) {
			sequences[i] = Integer.valueOf(br.readLine());
		}
		
		if (sequences == null || sequences.length <= 1) { switchNum = -1; } 
		else if(sequences[0] < sequences[1]) { switchNum = 1; }
		else if(sequences[0] > sequences[1]) { switchNum = 2; }
		else { switchNum = 0; }
		
		for(int i = 2; i < N; i++) {
			if(!((switchNum == 0 && sequences[i-1] == sequences[i]) || 
				(switchNum == 1 && sequences[i-1] < sequences[i]) ||
				(switchNum == 2 && sequences[i-1] > sequences[i]))) {
				switchNum = 3; break;
			}
		}
		
		sb.append(resultStr[switchNum]);
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new SoundsFishy().solution();
	}
	
}
