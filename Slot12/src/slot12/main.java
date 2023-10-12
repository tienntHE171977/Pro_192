
package slot12;


public class main {
    public static void main(String[] args) throws Exception{
        //String [] a = {"Hung", "Lan", "Ngo", "Khai", "San"};
        //int [] p = {22,18,15,11,7};
        
        System.out.println("Enter ng uoi dung:");
        int n=5;
        MySet t = new MySet();
        t.addMany(a,p,n);
        t.display();
        A x = new A("Hung", 18);
        t.add(x);
        t.display();
        
        System.out.println();
    } 
}
