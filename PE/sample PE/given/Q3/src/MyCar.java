

import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class MyCar implements ICar {


    @Override
    public int f1(List<Car> t) {
        int sum = 0;
    
        for(int i = 0; i < t.size(); i++){
            sum += t.get(i).getRate();
        }
        return sum/t.size();
    }

    @Override
    public void f2(List<Car> t) {
        int Max = t.get(0).getRate();
        int Min = t.get(0).getRate();
        int MaxIndex = 0;
        int MinIndex = 0;
        for(int i=0; i < t.size();i++){
            if(Max < t.get(i).getRate()){   // 1 2 3 3 2 3 1 // muốn tìm số cuối cùng thì thêm = vào
                Max = t.get(i).getRate() ;
                MaxIndex = i;
            }
            if(Min > t.get(i).getRate()){
                Min = t.get(i).getRate() ;
                MinIndex = i;
            }
        }
            Car temp = t.get(MaxIndex);
            t.set(MaxIndex, t.get(MinIndex));
            t.set(MinIndex, temp);
        }
    @Override
    public void f3(List<Car> t) {
        for(int i = 0; i < t.size(); i++)
        {
            for(int j = i+1; j < t.size() ; j++)
            {
                if(t.get(i).getMaker().compareTo(t.get(j).getMaker())> 0)
                {
                    Car temp = t.get(j);
                    t.set(j, t.get(i));
                    t.set(i,temp);
                }
                else if(t.get(i).getMaker().compareTo(t.get(j).getMaker())==0)
                {
                    if(t.get(i).getRate() < t.get(j).getRate())
                    {
                        Car temp = t.get(i);
                        t.set(i, t.get(j));
                        t.set(j,temp);
                        
                    }

                }

            }
        }
            
       
    }

}

