public class ReverseWordWise{
 	
public static void main(String[] args) {
		String str = "hello this is reversed";
          // reverseWordWise(str);
        
        
	}


	public static void reverseWordWise(String str){
	    String[] arr = str.split(" ");
	    String ans = "";
	    
	    for(int i = 0; i < arr.length; i++){
	        String temp = arr[i];
	        
	        for(int j = temp.length() - 1; j >= 0; j--){
	            ans = ans + temp.charAt(j);
	        }
	           ans = ans + " ";
	    }
	    
	    System.out.println(ans);
	}
}