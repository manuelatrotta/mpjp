package m2.s04;

public class Variable {
    public static void main(String[] args) {
        int value = 42;
        String name = "42";
        
        
        //conversion int in float cast
        int g = 34;
        float f = (float)g;
        System.out.println(f);
        
        //conversion int in a string  
        int x = 10;
        String s = String.valueOf(x);
        System.out.println(s);

        int number = 20;
        //conversion int in a string 
        if (number == 20) {
        	String twenty = String.valueOf(number);
        	System.out.println(twenty);
        }
        
        System.out.println(name);
        System.out.println(value);

        // Dangerous! Beware of null!
        String noName = null;
        System.out.println(noName);

        // Java 10 inferred type
        var bValue = 42;
        var bName = "Tom";

        System.out.println(bName);
        System.out.println(bValue);
    }
}
