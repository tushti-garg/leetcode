class Solution {
    public int reverse(int x) {
        int revnum = 0;

        while (x != 0) {
            int last_digit = x % 10;
            x = x / 10;

            // Check overflow before multiplying
            if (revnum > Integer.MAX_VALUE / 10 ||
                (revnum == Integer.MAX_VALUE / 10 && last_digit > 7)) {
                return 0;
            }

            if (revnum < Integer.MIN_VALUE / 10 ||
                (revnum == Integer.MIN_VALUE / 10 && last_digit < -8)) {
                return 0;
            }

            revnum = (revnum * 10) + last_digit;
        }

        return revnum;
    }
}