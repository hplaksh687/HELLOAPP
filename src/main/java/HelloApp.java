public class HelloApp {
    public static void main(String[] args) {

        String greeting;

        if (args.length == 0) {
            greeting = "Hello, World!";
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            String names = "";

            if (nameBuilder.length() > 0) {
                names = nameBuilder.substring(0, nameBuilder.length() - 2);
            }

            greeting = "Hello, " + names + "!";
        }

        System.out.println(greeting);
    }
}