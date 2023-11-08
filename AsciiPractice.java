public class AsciiPractice {
    public static void main(String[] args) {
        
    }
    // Question 5
    public static int stringToInt(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            sum += digit * Math.pow(10, ((str.length() - 1) - i));
        }
        return sum;
    }
    
    // Question 5, Expansion 1
    public static int stringToIntSign(String str){
        int sign = str.charAt(0) == '-' ? -1 : 1;
        String noSignStr = str;
        if (str.charAt(0) == '+' || str.charAt(0) == '-') {
            noSignStr = str.substring(1);
        }
            
        int sum = 0;
        for (int i = 0; i < noSignStr.length(); i++) {
            int digit = noSignStr.charAt(i) - '0';
            sum += digit * Math.pow(10, ((noSignStr.length() - 1) - i));
        }
        return sum * sign;
    }
    
    // Question 5, Expansion 1, Altered Version 
    public static int stringToIntSign1(String str){
        int sign = str.charAt(0) == '-' ? -1 : 1;
        String noSignStr = str;
        if (str.charAt(0) == '+' || str.charAt(0) == '-') {
            noSignStr = str.substring(1);
        }
        return sign * stringToInt(noSignStr);
    }

    // Question 5, Expansion 2
    public static double stringToDouble(String str) {
        int sign = str.charAt(0) == '-' ? -1 : 1; 		// sign handle
        String numStrNoSign = str;
        if (str.charAt(0) == '+' || str.charAt(0) == '-') {
            numStrNoSign = str.substring(1); 		// removing sign
        }
        int dotIndex = numStrNoSign.indexOf('.'); 		    // finding dot
        if (dotIndex == -1) {
            // removing cases without dot
            return sign * (stringToInt(numStrNoSign) + 0.0);  
        }
        double sum = 0;
        // sum before dot
    	for (int i = 0; i < dotIndex; i++) {
            int digit = numStrNoSign.charAt(i) - '0';
            sum += digit * Math.pow(10, ((dotIndex - 1) - i));
        }
        // sum after dot
        for (int i = dotIndex + 1; i < numStrNoSign.length(); i++) {
            int digit = numStrNoSign.charAt(i) - '0';
            sum += digit * Math.pow(10, (dotIndex - i));
        }
        return sum * sign;
    }

    // Question 6
    public static int[] digitFrequency(int n) {
        String str = "" + Math.abs(n);
        int[] appears = new int[10];
        for (int i = 0; i < str.length(); i++) { 
            int digit = str.charAt(i) - '0';
            appears[digit]++; 
        }
        return appears;
    }

    // Question 6, Expansion 1
    public static int mostFrequentDigit(int n) {
        int [] appears = digitFrequency(n);
        int maxKey = 0;
        for (int i = 0; i < appears.length; i++){
            if (appears[i] > maxKey){
                maxKey = i;
            }	
        }
        return maxKey;
    }

    // Question 6, Expansion 2
    public static String biggestNumberPossible(int n) {
        int [] appears = digitFrequency(n);
        String num = "";
        for (int i = 0; i < appears.length; i++){
            while (appears[i] > 0){
                appears[i]--;
                num += i;
            }	
        }
        return num;
    }
    
    




}
