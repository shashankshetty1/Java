public class polymorpisum{

    static class person{
        int age;
        String name;
        String lastname;

        void eat(){
            System.out.println(name +" is eating" );
        }
        void run(){
            System.out.println(name+ " is running");
        }
        void run(int steps){
            System.out.println(name +" ran " + steps + " Steps");
        }
    }
    public static void main(String[] args) {
        person p1= new person();
        p1.age=22;
        p1.name="Shashank";
        p1.lastname="shetty";

        person p2= new person();
        p2.age=30;
        p2.name="Shyam";

        p1.eat();
        p2.run();
        p1.run(5);        
    }
}