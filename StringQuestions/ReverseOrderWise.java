public class ReverseOrderWise{
	
	public static void main(String[] args) {
		String str = "hello this is reversed";
		String str2 = "racecard";
// 		System.out.print(count(str));
        // reverseWordWise(str);
        // reverseOrderWise(str);
        
        System.out.print(isPalindrome(str2));
	}
public static void reverseOrderWise(String str){
	    String[] arr = str.split(" ");
	    String ans = "";
	    
	    for(int i = arr.length - 1; i >= 0; i--){
	        String temp = arr[i];
	        
	        for(int j = 0; j < temp.length(); j++){
	            ans = ans + temp.charAt(j);
	        }
	           ans = ans + " ";
	    }
	    
	    System.out.println(ans);
	}
}