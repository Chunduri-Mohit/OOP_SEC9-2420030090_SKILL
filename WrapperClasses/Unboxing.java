package WrapperClasses;

public class Unboxing {
    public static void main(String[] args){

        Integer obj = new Integer(42);

        // Unboxing - manually converting object to primitive
        int num = obj.intValue();

        System.out.println(obj);
        System.out.println(num);

    }
}
