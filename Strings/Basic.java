
public class Basic{

    public static void main(String[] args) {
        
        String name="Shashank";

        int value=name.length();
        String value2="hi \nthis is\n\tshasahnk shetty";
        String valuee=name.toLowerCase();
        String valueee=name.toUpperCase();     

        System.out.println(name.length());
        System.out.println(name.substring(4));
        System.out.println(name.equals("Shashank"));
       System.out.println(name.startsWith("Sh"));
       System.out.println(name.charAt(4));
       System.out.println(name.replace("S", "A"));

        System.out.println(value2);
        System.out.println(valueee);
        
    }
    
}
