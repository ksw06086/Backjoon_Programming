package backjoon.problem.R20230804;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author swkim
<<<<<<< HEAD
 * @category ï¿½ï¿½ï¿½ï¿½, ï¿½ï¿½ï¿½Ú¿ï¿½
 * @updatedAt ï¿½è¼±ï¿½ï¿½, 2023.08.03(ï¿½ï¿½ï¿½ï¿½Ç®ï¿½ï¿½)
 * {@summary} ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½(a,i,u,e,o ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½)
 * - ï¿½Ô·ï¿½ : Ã¹Â°ï¿½ï¿½~ - ï¿½ï¿½ï¿½Ú¿ï¿½, ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ - #
=======
 * @category ±¸Çö, ¹®ÀÚ¿­
 * @updatedAt ±è¼±¿ì, 2023.08.03(¹®Á¦Ç®ÀÌ)
 * {@summary} ¸ðÀ½ÀÇ °³¼ö(a,i,u,e,o °³¼ö Ãâ·Â)
 * - ÀÔ·Â : Ã¹Â°ÁÙ~ - ¹®ÀÚ¿­, ¸¶Áö¸·ÁÙ - #
>>>>>>> f2bf53f35408a64900f236c9913e507eff5fe909
 * https://www.acmicpc.net/problem/1264
 */
public class VowelsCount {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String str = br.readLine().toLowerCase();
			if(str.equals("#")) { break; }
			int count = 0;
			for(int i = 0; i < str.length(); i++) {
				switch(str.charAt(i)) {
					case 'a': case 'i': case 'u': case 'e': case 'o':
						count++;
				}
			}
			sb.append(count).append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new VowelsCount().solution();
	}
	
}
