public class HighestChar{

    public static char highestOccuringChar(String str) {
        int[] freq = new int[26];
        
        for(int i = 0; i < str.length(); i++){
            freq[str.charAt(i) - 'a']++;
        }
        
        int ans = 0, idx = -1;
        
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > ans){  
                ans = freq[i];
                idx = i;
            }
        }
        
        return (char)(idx + 'a');
    }

    public static void main(String[] args) {
        System.out.print(highestOccuringChar("abcdd"));
    }
}