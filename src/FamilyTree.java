import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    List<Human> humanList;

    public FamilyTree(List<Human> humanList) {
        this.humanList = humanList;
    }

    public FamilyTree() {
        this(new ArrayList<>());
    }


    public void getInfo() {
        for (Human item : humanList) {
            item.getInfo();
        }

    }

    public void add(Human human) {
        if (!humanList.contains(human)) {
            humanList.add(human);
            if (human.getFather() != null) {
                human.getFather().addChild(human);
            }
            if (human.getMother() != null){
                human.getMother().addChild(human);
            }
        }
    }

    public Human getByName (String name){
        for (Human human: humanList){
            if (human.getName().equals(name)){
                return human;
            }
        }
        return null;
    }
}