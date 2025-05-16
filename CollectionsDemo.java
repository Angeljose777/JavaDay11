import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

        // ✅ Sort a list of names
        List<String> students = new ArrayList<>(List.of("Zoe", "Adam", "John"));
        Collections.sort(students);
        System.out.println("Sorted students: " + students);

        // ✅ Remove duplicates using HashSet
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 2, 3, 4, 4, 5));
        Set<Integer> uniqueNums = new HashSet<>(nums);
        System.out.println("Unique numbers: " + uniqueNums);

        // ✅ TreeSet with natural ordering
        Set<String> countries = new TreeSet<>(List.of("India", "Australia", "USA"));
        System.out.println("Sorted countries: " + countries);

        // ✅ Compare ArrayList vs LinkedList for insertion (basic benchmark)
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(0, i);  // Inserting at the beginning
            linkedList.add(0, i); // Inserting at the beginning
        }

        System.out.println("Insertions into ArrayList and LinkedList completed.");
    }
}
