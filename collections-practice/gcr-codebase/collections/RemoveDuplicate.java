package collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
    static List<Integer> removeDuplicate(List<Integer> list) {
        ArrayList<Integer>list1=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(!list1.contains(list.get(i))){
                list1.add(list.get(i));
            }
        }
        return list1;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> output = removeDuplicate(list);

        System.out.println(output);
    }
}
