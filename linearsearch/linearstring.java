import java.util.Scanner;

public class linearstring {

    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        System.out.println("enter the name");
        String name=in.next();
        char target='k';
        System.out.println(search(name,target));

    }
    static boolean search(String str,char target){
        if(str.length()==0){
        return false;
        }

        for(int i=0;i<str.length();i++){
            if (target==str.charAt(i)){
                return true;
            }

        }
        return false;
    }
}

