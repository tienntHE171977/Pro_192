
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC
 */
public class MyCrane implements ICrane {

    @Override
    public int f1(List<Crane> list) {
        int count = 0;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).getPrice() < list.get(i + 1).getPrice()) {
                count++;
            }

        }
        return count;
    }

    @Override
    public void f2(List<Crane> list) {
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i).getPrice() == list.get(j).getPrice()){
                        list.get(i).setOwner("T");
                        list.get(j).setOwner("T");
                   
                }
                
            }
            if(flag == true){
                break;
            }
        }
    }

    @Override
    public void f3(List<Crane> list) {
        Collections.sort(list.subList(1, 6), new Comparator<Crane>() {
            @Override
            public int compare(Crane o1, Crane o2) {
                int value = o2.getOwner().compareTo(o1.getOwner());
                if(value == 0){
                    value = o1.getPrice() - o2.getPrice();
                }
                return value;
            }
        });
    }

}
