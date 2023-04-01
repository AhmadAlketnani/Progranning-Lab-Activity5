import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Q1
        String sentence = "This is Activity 4; it's about using Collections Framework and Functional Programming. ";
        List<String> arrayList = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        Collections.sort(arrayList);
        System.out.println("ArrayList: "+arrayList);

        //Q2
        Set<String> hashSet = new HashSet<>(arrayList);
        System.out.println("HashSet: "+hashSet + "\n");

        //Q3
        String[][] cars = {{"AUDI", "4"}, {"KIA", "10"}, {"BMW", "5"}, {"FORD", "2"}};
        Map<String, Integer> hashMap = new HashMap<>();
        for (String[] car : cars) {
            hashMap.put(car[0], Integer.parseInt(car[1]));
        }
        System.out.println("HashMap: "+hashMap);

        //Q4
        int result = hashMap.values().stream().reduce(1, (x, y) -> x * y);
        System.out.println("The multiply of the HashMap values = "+result+"\n");

    }
}
