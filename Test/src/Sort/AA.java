package Sort;

import java.util.HashMap;


public class AA {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> x = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            if(x.containsKey(nums[i])){
                if( Math.abs(i-x.get(nums[i])) <= k){
                    return true; 
                }
                x.put(nums[i],i);
            }
        }
        return false;
    
    }
    
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        System.out.println(a[0].length);
            
     }
}
