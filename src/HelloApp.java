public class HelloApp {

    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Build names using enhanced for loop
        StringBuilder sb = new StringBuilder();

        for (String name : args) {
            sb.append(name).append(", ");
        }

        // Remove last comma and space
        sb.setLength(sb.length() - 2);

        System.out.println("Hello, " + sb.toString() + "!");
    }
}