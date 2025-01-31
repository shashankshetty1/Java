public class findMin {
    
    public static void main(String[] args){
        int[] arr={2,3,4,5,6,-9,7};
        System.out.println(minimum(arr));
        

    }
    static int minimum(int[] arr){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }

        }
        return ans;



    }
}
