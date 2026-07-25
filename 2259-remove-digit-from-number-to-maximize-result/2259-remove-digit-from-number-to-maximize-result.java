class Solution {
    public String removeDigit(String number, char digit) {

        String ans = "";

        for (int i = 0; i < number.length(); i++) {

            if (number.charAt(i) == digit) {

                StringBuilder sb = new StringBuilder(number);
                sb.deleteCharAt(i);

                if (ans.compareTo(sb.toString()) < 0) {
                    ans = sb.toString();
                }
            }
        }

        return ans;
    }
}