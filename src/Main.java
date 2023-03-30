import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Bob", "Scott", Sex.male);
        Human human2 = new Human("Jack", "Vorobey", Sex.male);
        Human human3 = new Human("Poll", "Newman", Sex.male);
        Human human4 = new Human("Kylie", "Minogue", Sex.female);

        List<Human> list = new ArrayList<>();

        list.add(human1);
        list.add(human2);
        list.add(human3);
        list.add(human4);

        FamilyTree familyTree = new FamilyTree(list);

        System.out.println(familyTree);

    }
}