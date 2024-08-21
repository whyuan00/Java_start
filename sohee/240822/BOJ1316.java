package BOJ.S240822;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class BOJ1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++){
            String word = br.readLine();
            char[] arr = new char[word.length()];
            int idx = 0;

            boolean isGroupWord = true;

            // 단어 문자를 순회하면서
            for (int j = 0; j < word.length(); j++){
                char now = word.charAt(j);
                // 이미 있는지 확인하는 변수
                boolean found = false;

                // 1. 이미 있는 경우
                for (int k = 0; k < idx; k++) {
                    if (arr[k] == now) {
                        found = true;
                        break;
                    }
                }

                // 문자가 arr에 없으면 추가
                if (!found) {
                    arr[idx++] = now;
                } else if (arr[idx - 1] != now) { // 문자가 있지만 연속된 문자가 아니라면
                    isGroupWord = false;
                    break;
                }
            }

            if (isGroupWord) {
                cnt++;
            }
        }
        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
