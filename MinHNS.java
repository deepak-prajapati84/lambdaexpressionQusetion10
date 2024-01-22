interface PrintTable{
    void print();
}

interface ShowTable{
    void show();
}

class NotSP implements PrintTable,ShowTable{
    public void print(){System.out.println("PrintTable Is support or Not support :");}
    public void show(){System.out.println("ShowTable Is support or Not support : ");}
}

public class MinHNS{
    public static void main(String[] args){
        NotSP op=new NotSP();
        op.print();
    }
}