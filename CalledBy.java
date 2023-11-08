public class CalledBy {

    public static void main(String[] args){

        int i = 111; 
        int j = 222;
        swap(i, j);
        System.out.println("i : " +  i + ", j : " + j);
        // i : 111 , j : 222


        int[] array = {1, 2, 3};	
        System.out.println(array[1]); // 2
        int[] res = add5(array);
        System.out.println(array[1]); // 2
        System.out.println(res[1]);	  // 7
        add5Unsafe(array);
        System.out.println(array[1]); // 7
    }
    
    public static void add5Unsafe(int[] x){
        for (int i = 0; i < x.length; i++){
         x[i] = x[i] + 5;
        }
     }
     
    public static int [] add5(int[] x){
       int [] newX = new int [x.length];
       for (int i = 0; i < x.length; i++){
        newX[i] = x[i] + 5;
       }
       return newX;	
    }
    
    public static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }
    
    
}
