public class ArrayRemove {
    public static void main(String[] args) {
        
    }
    public static int[] remove(int[] arr, int element) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }
        int[] ans = new int[arr.length - count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != element){
                ans[index] = arr[i];
                index++;
            }
        }
        return ans;
    }
    
}
