import java.util.*;

public class DemoGenerics {
    public static void main(String[] args) {
        // Pair demo
        Pair<String,Integer> p = new Pair<>("age", 30);
        System.out.println(p);

        // GenericStack demo
        GenericStack<String> stack = new GenericStack<>();
        stack.push("one"); stack.push("two");
        System.out.println("Stack peek: " + stack.peek());

        // findMax demo
        Integer[] nums = {3, 7, 1, 9, 2};
        System.out.println("Max: " + GenericUtils.findMax(nums));

        // Repository demo
        Repository<String> repo = new Repository<>();
        repo.add("Alice"); repo.add("Bob"); repo.add("Charlie");
        List<String> startsWithB = repo.find(s -> s.startsWith("B"));
        System.out.println("Starts with B: " + startsWithB);

        // printList with wildcard
        GenericUtils.printList(repo.getAll());
    }
}
