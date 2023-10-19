import java.util.*;

public class Manager {
    public static void main(String[] args) {
        Hello<String> hello = new Hello<>("Moin");
        hello.testMethod();

        String[] names = {"Chani", "Elon", "Leto"};

        Iterator<String> iterator = Arrays.stream(names).iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name.toUpperCase());
        }

        for(String name: names) {
            System.out.println(name.replace("o", "i"));
        }


        var dict = new HashMap<String, String>();
        dict.put("hello", "Hallo");
        dict.put("Hallo", "hello");
        dict.put("cat", "Katze");
        dict.put("Katze", "cat");

        Scanner sc = new Scanner(System.in);
        System.out.println("Print \"end\" to finish the program.");
        while (true) {
            String input = sc.nextLine();
            if (input.equals("end")) {
                break;
            }
            String translation = dict.getOrDefault(input, "sacre bleu");
            System.out.println(translation);
        }
        sc.close();
    }
}

