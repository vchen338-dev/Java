package practicefunda;

public class Datatypes {

	public static void main(String[] args) {
 // ========= PRIMITIVE DATA TYPES =========
        
        // 1. byte - 8-bit signed integer (-128 to 127)
        byte age = 25;
        System.out.println("Byte example (age): " + age);

        // 2. short - 16-bit signed integer (-32,768 to 32,767)
        short year = 2025;
        System.out.println("Short example (year): " + year);

        // 3. int - 32-bit signed integer (-2,147,483,648 to 2,147,483,647)
        int population = 110000000; // Example: population of a country
        System.out.println("Int example (population): " + population);

        // 4. long - 64-bit signed integer
        long worldPopulation = 7800000000L; // L is required at the end
        System.out.println("Long example (world population): " + worldPopulation);

        // 5. float - 32-bit floating point (decimal numbers, ~6-7 digits precision)
        float pi = 3.14f; // f is required
        System.out.println("Float example (pi): " + pi);

        // 6. double - 64-bit floating point (more precise, ~15 digits precision)
        double goldenRatio = 1.6180339887;
        System.out.println("Double example (golden ratio): " + goldenRatio);

        // 7. char - 16-bit Unicode character (single characters)
        char grade = 'A';
        System.out.println("Char example (grade): " + grade);

        // 8. boolean - true or false
        boolean isJavaFun = true;
        boolean isSkyGreen = false;
        System.out.println("Boolean example (isJavaFun): " + isJavaFun);
        System.out.println("Boolean example (isSkyGreen): " + isSkyGreen);


        // ========= NON-PRIMITIVE (REFERENCE) DATA TYPES =========

        // String - sequence of characters
        String name = "Master Boss";
        System.out.println("String example (name): " + name);

        // Arrays - collection of similar data type
        int[] numbers = {10, 20, 30, 40};
        System.out.println("Array example (numbers[2]): " + numbers[2]);

        // Wrapper Classes (Integer, Double, etc.)
        Integer objInt = 100; // Autoboxing: primitive int to Integer object
        Double objDouble = 99.99;
        System.out.println("Wrapper class example (Integer): " + objInt);
        System.out.println("Wrapper class example (Double): " + objDouble);

        // Object - base class of all classes in Java
        Object generic = "I can hold anything!";
        System.out.println("Object example: " + generic);

	}

}
