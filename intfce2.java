interface print{
    void ptn();
}

interface show {
    void shw();  
}

interface Deepak{
    void s();
}

class A7 implements print,show{
    public void ptn(){System.out.println("Hello Deepak");}
    public void shw(){System.out.println("Hello Surya Prajapti");}
    public void Deepak(){System.out.println("Hello Deepak Prajapti and Anjali ");}
}

public class intfce2{
    public static void main(String[] args){
        A7 a=new A7();
        a.ptn();
        a.shw();
        a.Deepak();
    }
}