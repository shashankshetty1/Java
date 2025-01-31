import java.util.ArrayList;
import java.util.Scanner;

public class arraylist{
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<Integer>();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4); 
        list.add(5);

        System.out.println(list);


        list.set(0, 99);

        list.add(420);
        list.remove(3);

        System.out.println(list);




        
    }
}