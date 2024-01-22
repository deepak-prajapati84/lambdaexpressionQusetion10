interface Bank{
    float rate();
}

class SBI implements Bank{
    public float rate(){return 9.15f;}
}

class PBI implements Bank{
    public float rate(){
        return 90.54f;
    }
}

public class intfce{
    public static void main(String[] args){
        Bank b=new PBI();

        System.out.println("OLK is : " + b.rate());
    }
}