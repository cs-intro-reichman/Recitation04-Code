public class ArrayUtils {

    public static void main(String[] args) {
        int [] declare1 = {1, 2, 3};
        int [] declare2 = new int [4];
    }
    // Question 1
    public static void printArray(int[] array){
        System.out.print('{'); 
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            char c = i != array.length - 1 ? ',' : '}';
            System.out.print(c);
        }
        System.out.println();
    }
    // Question 2
    public static boolean equalsArray(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    
}
