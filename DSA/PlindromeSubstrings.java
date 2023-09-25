package DSA;

public class PlindromeSubstrings {
    static boolean isPalindrome(String s) {
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }

        if (s.equals(reverse))
            return true;
        return false;
    }

    static int check(String str) {
        int result = str.length();
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String substr = str.substring(i, j + 1);
                if (isPalindrome(substr)) {
                    result++;
                    System.out.println(substr);
                }

            }
        }
        return result;
    }

    
    public static void main(String[] args) {
        String str = "abbaeae";
        System.out.println(check(str));
    }
}
