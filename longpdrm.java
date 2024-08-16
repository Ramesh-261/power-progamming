import java.util.Scanner;

public class longpdrm {

    public static String longestPalindrome(String s) {
        int n = s.length();
        if (n <= 1) return s;
        int st = 0;
        int max_len = 1;

        // odd length palindrome
        for (int i = 0; i < n; i++) {
            int l = i, r = i;

            while (l >= 0 && r < n) {
                if (s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                } else {
                    break;
                }
            }

            int len = r - l - 1;
            if (max_len < len) {
                max_len = len;
                st = l + 1;
            }
        }

        // even length palindrome
        for (int i = 0; i < n - 1; i++) {
            int l = i, r = i + 1;

            while (l >= 0 && r < n) {
                if (s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                } else {
                    break;
                }
            }

            int len = r - l - 1;
            if (max_len < len) {
                max_len = len;
                st = l + 1;
            }
        }

        return s.substring(st, st + max_len);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String -:");
        String str = sc.nextLine();
        System.out.println("Longeststring "+longestPalindrome(str));
    }
}
