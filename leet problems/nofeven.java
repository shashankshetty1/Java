
// given an array nums of integer,return how many of them contaion an even number of digits

public class  nofeven {
    public static void main(String[] args) {


        int[] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));


       
        
    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;

    }

    //function to chech wether a no. contains even no. or not
    static boolean even(int num){
        int numberofdigits=digits(num);
        if(numberofdigits%2==0){
            return true;
            
        }
        else{
            return false;
        }
    }

    // count no of digits in a number

    static int digits(int num){

       int count=0;

        while(num>0){
            count=count+1;
            num=num/10;
        }
        return count;
    }
   
    
}
