public class linearsearch{
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9,0};
        int target=7;
        int ans=linearSearch(arr, target);
        System.out.println("your item is in "  + ans);

        
    }
    static int linearSearch (int arr[], int target){

        if(arr.length==0){
            return -1;
        }

        for (int index = 0; index< arr.length; index++) {

            int element=arr[index];
            if(element==target){
                return index;
               
            }
            
            
        }
        return -1;

    }
    
}
