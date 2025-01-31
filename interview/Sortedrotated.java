public class Sortedrotated {

    public static void main(String[] args) {
        int[] nums={3,4,5,1,2};  
        System.out.println(check(nums));
    }
    public static boolean check(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0 ; i<nums.length ; i++){
            for(int j = 0 ; j<nums.length ; j++){
                arr[j] = nums[(i+j) % nums.length];
            }
            if(checkSorted(arr)){
                return true;
            }
        }
        return false;  
    }
    public static boolean checkSorted(int[] arr){
        for(int i = 0 ; i<arr.length-1 ; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    
}