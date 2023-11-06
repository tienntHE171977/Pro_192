
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class MyCrane implements ICrane {

    @Override
    public int f1(List<Crane> list) {
    int count = 0;
       for (int i = 0; i < list.size() - 1; i++)
       {
           if(list.get(i).getPrice() <= list.get(i+1).getPrice())
               count++;
       }
           return count;
    }

    @Override
    public void f2(List<Crane> list) {
    int a = FirstIndex(list);
    for(int i = a; i< list.size(); i++)
    {
        if(list.get(i).getPrice() == list.get(a).getPrice())
        {
            list.get(i).setOwner("T");
        }
    }
    list.get(a).setOwner("T");
    }

    @Override
    public void f3(List<Crane> list) {
        for (int i = 1; i < 6 ; i++)
        {
            for(int j = 2 ; j < 5 ; j++)
            {
               if(list.get(i).getOwner().compareTo(list.get(j).getOwner()) < 0)
               {
                   Crane temp = list.get(i);
                   list.set(i, list.get(j));
                   list.set(j,temp);
                   
               }
               else if(list.get(i).getOwner().compareTo(list.get(j).getOwner()) == 0)
               {
                   if(list.get(i).getPrice() > list.get(j).getPrice())
                   {
                        Crane temp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j,temp);
                   }
                   
               }
            }
        }
    }
    
    private int FirstIndex(List<Crane> list){
        for(int i = 0 ; i < list.size()-1; i++){
            for(int j = i+1 ; j < list.size(); j++)
            {
                if(list.get(i).getPrice() == list.get(j).getPrice()){
                    return i;
                }
            }
        }              return -1;
}

}
