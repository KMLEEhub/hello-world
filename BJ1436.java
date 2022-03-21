package baekjooon;

import java.util.Scanner;

//영화감독 숌
public class BJ1436 {
    public static void main(String[] args) {
        int cnt = 0;
        int answer = 666;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (true) {
            // answer이 666연달아 포함한 수이면 cnt++
            boolean flag = false;
            String a = Integer.toString(answer);
            for (int i = 0; i < a.length() - 2; i++) {
                if (a.charAt(i) == '6' && a.charAt(i + 1) == '6' && a.charAt(i + 2) == '6') {
                    flag = true;
                    break;
                }
            }
            if (flag)
                cnt++;
            // cnt==x 이면 answer출력 break;
            if (cnt == x) {
                System.out.println(answer);
                break;
            }
            answer++;
            //수정수정 test
        }
    }
}
