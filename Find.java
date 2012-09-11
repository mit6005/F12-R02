
public class Find {
    
    /**
     * Find the first occurrence of x in sorted array a.
     * @param x value to find
     * @param a array sorted in increasing order (a[0] <= a[1] <= ... <= a[n-1])
     * @return lowest i such that a[i]==x, or -1 if x not found in a. 
     */
    public static int find(int x, int[] a) {
        
        throw new RuntimeException("find not implemented");
        //return linearSearch(x,a);
    }
    

    /*
     * Find the first occurrence of x in sorted array a[lo..hi-1].
     * @param x value to find
     * @param a array sorted in increasing order 
     *          (a[0] <= a[1] <= ... <= a[n-1])
     * @param lo low end of range. 
     *              Requires 0 <= lo <= a.length-1.
     * @param hi high end of range.  
     *              Requires 0 <= hi < a.length, and hi >= lo.
     * @return lowest i such that lo<=i<hi and a[i]==x, 
     *         or -1 if there's no such i. 
     */
    
    private static int binarySearchInRange(int x, int[] a, int lo, int hi) {
        throw new RuntimeException("binarySearchInRange not implemented");
        //Implement your function here
    }

    
    /*
     * Same spec as find().  Uses linear search.
     */
    private static int linearSearch(int x, int[] a) {
        
        for (int i = 0; i < a.length; ++i) {
            if (x == a[i]) {
                return i;
            }
        }
        return -1;
    }
    
    /*
    //If you want to test your code within console, run main function. 
    public static void main (String[] args) {
        int x = 1;
        int[] a = new int[] {1,1,2,3};
        int mid = find(x,a);
        System.out.println(mid);
        
    }
    */
}
