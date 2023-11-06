


public class SpecCala extends Cala{
    private int color;

    public SpecCala() {
    }

    public SpecCala( String owner, int price,int color) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return getOwner()+","+getPrice()+","+color;
    }
    public void setData(){
        setOwner(getOwner().replaceFirst(getOwner().substring(1,2), "XX"));
        
    }
    
    public int getValue(){
        if(color % 2 !=0){
            return getPrice()+3; 
        }
        else{
            return getPrice()+7;
        }
    }

}
