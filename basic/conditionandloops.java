import java.util.Scanner;

public class conditionandloops{
    public static void main(String[] args) {

        // if else


        // Scanner in = new Scanner(System.in);
        // System.out.println("enter your salaray");
        // int  i =in.nextInt();
        // if( i>10)
        // {
        //     i=i+10;
        //     System.out.println("congratulations you have great salary" + i);
        // }
        // else
        // { 
        //     i= i-10;
        //     System.out.println("sorry     "   +     i);
        
        // }


 // anything repitedly using for loop

        // System.out.println("enter what to print and how many times");
        // Scanner in=new Scanner(System.in);
        
        // int z =in.nextInt();
        //  for( int n=1; n <=z; n++){
        //     System.out.println("om ganeshhaa"); 
        // }
//anything using while loop


    //     int n=1;
    //     while(n<5)
    // {
    //     System.out.println("hai");
    //     n+=1;
    // }
//do while loop


    // int n=1;
    // do{
    //     System.out.println(n);
    //     n++;
    // }
    // while(n<5);
          
//print the largestr number

Scanner in=new Scanner(System.in);

int a=in.nextInt();
int b=in.nextInt();
int c=in.nextInt();

// int max=a;

// if(b>max)
// {
//     max=b;
// }
// if(c>max){
//     max=c;
// }
// System.out.println(max);

int max = Math.max(c,Math.max(a,b));

System.out.println(max);

         

         
       
        
    }
}