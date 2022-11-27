package com.company.Array;
public class Inheritance {
    int roll;
    String name;
    double marks;
    void input(){
        System.out.println("Enter noll, name and marks:");
    }
}
class inamul extends Inheritance{
    void disp(){
        roll=11;
        name="Inamul Haque";
        marks=90;
        System.out.println("Student 1:"+roll+" "+name+" "+marks);
    }
    public static void main(String[] args) {
        inamul in=new inamul();
        Zishan zi=new Zishan();
        Danish di=new Danish();
        Danis da=new Danis();
        in.input();
        in.disp();
        zi.disp();
        di.disp();
        da.disp();
    }
}
class Zishan extends Inheritance{
    void disp(){
        roll=12; name="Zeeshan Khan"; marks=80;
        System.out.println("Student 2:"+roll+" "+name+" "+marks);
    }
}
class Danish extends Inheritance{
    void disp(){
        roll=14; name="Danish Khan"; marks=50;
        System.out.println("Student 3:"+roll+" "+name+" "+marks);
    }
}
class Danis extends Inheritance{
    void disp(){
        roll=15; name="Dan Khan"; marks=95;
        System.out.println("Student 4:"+roll+" "+name+" "+marks);
    }
}
