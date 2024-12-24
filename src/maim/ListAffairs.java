package maim;

import java.util.ArrayList;
import java.util.List;


public class ListAffairs {
    private List<String> listaffairs = new ArrayList<>();

    public boolean add(String text) {

        return listaffairs.add(text);
    }
    public String removeIndex(int index) {
        if (index <= listaffairs.size() && index >= 0) {
            return listaffairs.remove(index);
        }
        return "такой задачи нет";
    }
    public boolean removeText(String text){
        return  listaffairs.remove(text);
    }

    public List<String> getListaffairs() {
        return listaffairs;
    }

}