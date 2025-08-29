package practicefunda;

public class UserInput {

	public static void main(String[] args) {
		 // 1. Using Scanner (most common)
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Reads a whole line of text

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();       // Reads an integer

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        // 2. Using BufferedReader (faster, but more code)
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your favorite color: ");
        String color = reader.readLine();  // Reads a line of text

        System.out.println("Your favorite color is " + color);

        // 3. Using Command Line Arguments (when running program)
        // Run program like: java UserInputExamples John 25
        // args[0] = "John", args[1] = "25"
        if (args.length > 0) {
            System.out.println("Command line input: " + args[0]);
        }

        // 4. Using JOptionPane (Graphical User Interface Input)
        String city = JOptionPane.showInputDialog("Enter your city:");
        JOptionPane.showMessageDialog(null, "You live in " + city);

        // 5. Using Console (rarely used, good for passwords)
        // Works only in real console (not IDEs sometimes)
        /*
        Console console = System.console();
        if (console != null) {
            String username = console.readLine("Enter username: ");
            char[] password = console.readPassword("Enter password: ");
            System.out.println("Username: " + username);
            System.out.println("Password length: " + password.length);
        }
        */

        scanner.close(); // Always close Scanner
	}

}
