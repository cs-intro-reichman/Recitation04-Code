
public class SetOps {
    public static void main(String[] args) {
        int [] arr = {1, 8, 20, -3, 0, 1, 1, 6, 8};
        int [] set = set(arr);
        
        ArrayUtils.printArray(set);
    }
    // Question 4
    public static boolean contains(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false ;
    }
    
    // Question 4, Expansion 1
    public static boolean contains(int[] arr, int value, int index) {
        for (int i = 0; i < index; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false ;
    }

    // Question 4, Expansion 2
    public static int countUnique(int[] arr) {
        int count = 0; 
        for (int i = 0; i < arr.length; i++) {
            count = contains(arr, arr[i], i) ? count : count + 1;
        }
        return count;
    }
    
    // Question 4, Expansion 3
    public static int [] set (int[] arr) {
        int [] res = new int [countUnique(arr)];
        int index = 0; 
        for (int i = 0; i < arr.length; i++) {
            if (!contains(arr, arr[i], i)){
                res[index++] = arr[i];
            }
        }
        return res;
    }
    
    // Question 4, Expansion 4
    public static int [] unionSets(int[] set1, int[] set2) {
        int [] res = new int [set1.length + set2.length];
        int index = 0; 
        for (int i = 0; i < set1.length; i++) {
            res[index++] = set1[i];
        }
        
        for (int i = 0; i < set2.length; i++) {
            res[index++] = set2[i];
        }
        return set(res);
    }

    public static int [] unionSets1(int[] set1, int[] set2) {
        int [] res = new int [set1.length + set2.length];
        for (int i = 0; i < res.length; i++) {
            if (i < set1.length){
                res[i] = set1[i];
            } else {
                res[i] = set2[i - set1.length];
            }
        }
        
        return set(res);
    }
    
    // Question 4, Expansion 5
    public static int [] intersectionSets(int[] set1, int[] set2) {
        int [] arr = new int [Math.min(set1.length , set2.length)];
        int [] smallSet = set1.length < set2.length ? set1 : set2;
        int [] bigSet = set1.length < set2.length ? set2 : set1;
        int size = 0;
        for (int i = 0; i < smallSet.length; i++) {
            if (contains(bigSet, smallSet[i])){
                arr[size++] = smallSet[i];
            }
        }

        int [] res = new int [size];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    // Question 4, Expansion 6
    public static int [] diffSets(int[] set1, int[] set2) {
        int [] arr = new int [set1.length];
        int size = 0;
     
        for (int i = 0; i < set1.length; i++) {
            if (!contains(set2, set1[i])){
                arr[size++] = set1[i];
            }
        }
        int [] res = new int [size];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }
    
    // Question 4, Expansion 7
    public static int [] symDiffSets(int[] set1, int[] set2) {
        int [] diff12 = diffSets(set1,set2);
        int [] diff21 = diffSets(set2,set1);
        return unionSets(diff12,diff21);
    }
    
}
