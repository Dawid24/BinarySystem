public class Solution {

    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int count = 0;
        int sum = 0;

        for(int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                continue;
            } else if (binary.charAt(binary.length() - 1) == '0' && i == binary.length() - 1) {

                while(binary.charAt(i) == '0') {
                    i--;
                }

            } else if (binary.charAt(i) == '0') {
                while (binary.charAt(i) == '0') {
                    count++;
                    i--;
                }
                if (count > sum) {
                    sum = count;
                    count = 0;
                }
            }
        }

        return sum;
    }

}

