import java.util.*;
import java.util.stream.Collectors;

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

        //Q5
        User user1 =new User(1,"mahmoud","123456",22,591234567,"mahmoud@gmai.com"),
         user2 =new User(2,"ahmad","654321",30,591234567,"ahmad@gmai.com"),
         user3 =new User(3,"osama","345621",18,591234567,"osama@gmai.com");

        //Q6
        Set<User> users = new HashSet<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        List<User> usersGreaterThan18 = users.stream()
                .filter(user -> user.getAge() >= 18)
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
        System.out.println("Users: ");
        for (User user : usersGreaterThan18) {
            System.out.println(user.toString().toUpperCase());
        }



    }

}
