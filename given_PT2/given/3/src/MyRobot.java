
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
public class MyRobot implements IRobot{

    @Override
    public int f1(List<Robot> t) {
        int sum = 0;
        for (Robot robot : t) {
        String label = robot.getLabel();
        if (!label.contains("A") && !label.contains("B")) {
            sum += robot.getStep();
        }
    }
    return sum;
    }

    @Override
    public void f2(List<Robot> t) {
        int max = 0;
        int index = -1;
        for (int i =0; i<t.size();i++) {
            if(t.get(i).getStep()>max){
                max = t.get(i).getStep();
                index = i;
                if(index == 1){
                    t.remove(index);
                }
            }
        }
    }

    public void f3(List<Robot> t) {
    Comparator<Robot> comparator = new Comparator<Robot>() {
        @Override
        public int compare(Robot r1, Robot r2) {
            int step1 = r1.getStep();
            int step2 = r2.getStep();
            String label1 = r1.getLabel();
            String label2 = r2.getLabel();
            
            // So sánh giá trị step
            if (step1 != step2) {
                return Integer.compare(step1, step2);
            }
            
            // So sánh label ngược dựa trên APB
            return label2.compareTo(label1);
        }
    };
    
    Collections.sort(t.subList(1, Math.min(t.size(), 5)), comparator);
}

    
}
