
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
 * @author FPT
 */
public class MyBrick implements IBrick{

    @Override
    public int f1(List<Brick> t) {
        int count = 0;
        for (Brick brick : t) {
            char firstChar = brick.getPlace().charAt(0);
            char lastChar = brick.getPlace().charAt(brick.getPlace().length()-1);
            if(Character.isDigit(firstChar)&& Character.isLetter(lastChar)){
                count ++;
            }
        }
        return count;
    }
    
    @Override
    public void f2(List<Brick> t) {
        if(t.isEmpty()){
            return;
        }
        int max =t.get(0).getPrice();
        int index = 0;
        for(int i =0; i<t.size();i++){
            if(t.get(i).getPrice()> max && t.get(i).getPrice() % 2 == 1){
                max =t.get(i).getPrice();
                index = i;
            }
            
        }
        t.get(index).setPlace("XX");
    }

    @Override
    public void f3(List<Brick> t) {
        int max = t.get(0).getPrice();
        int pos = 0;
        for(int i=0; i< t.size(); i++){
            if(t.get(i).getPrice() > max ){
                max = t.get(i).getPrice();
                pos = i;
            }
        }
        Collections.sort(t.subList(0, pos), new Comparator<Brick>() {
            @Override
            public int compare(Brick o1, Brick o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
    }
    
}
