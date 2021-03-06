import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[str.length()];
        for(int i = 0; i < str.length(); i++)
            arr[i] = str.charAt(i) - '0';
        Arrays.sort(arr);
        for(int i = str.length()-1; i >= 0; i--)
            sb.append(arr[i]);
        answer = Long.valueOf(sb.toString());
        return answer;
    }
}
