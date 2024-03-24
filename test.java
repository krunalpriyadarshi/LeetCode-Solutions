class Container{
    public int liquid;

    public Container(){
        liquid= 0;
    }

    public int contains(){
        return this.liquid;
    }

    public void add(int amount){
        if(amount> 0){
            this.liquid+= amount; 
            if(this.liquid> 100) this.liquid= 100;
        }
    }

    public void remove(int amount){
        this.liquid-= amount;
        if(this.liquid< 0){
            this.liquid= 0;
        }
    }

    public String toString(){
        //amount of liquid/100
        return this.liquid + "/100";
    }
}

public class test {

    public static void main(String[] args) {
       Container c1= new Container();
       Container c2= new Container();
    }

}
