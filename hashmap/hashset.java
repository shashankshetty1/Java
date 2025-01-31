import java.util.HashSet;

public class hashset {
    public static void main(String args[]){

    HashSet<Integer> set= new HashSet<>();

    set.add(1);
    set.add(2);
    set.add(3);
    set.add(1);

    System.out.println("set size " + set.size());

    System.out.println(set);

    if(set.contains(1)){
        System.out.println("yes it contaions 1");
    }
    if(set.contains(6)){
        System.out.println("yes");
    }else{
        System.out.println("no");
    }
    set.remove(1);
    if(!set.contains(1)){
        System.out.println("1 removed");
    }




    
}
}
