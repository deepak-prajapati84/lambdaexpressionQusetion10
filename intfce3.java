interface int1{
    final int a=40;

    void display();
}

class intfce3 implements int1{
    public void display(){
        System.out.println("Hellow Deepak ? How Are You ? ");
    }

    public static void main(String[] args){
        intfce3 op=new intfce3();
        op.display();
        System.out.println(a);
    }
}