package core_java;

class Students{
    String name ;
    int age ;
    double grade ;
    public  Students(String name , int age , double grade){
        this.name = name ;
        this.age = age ;
        this.grade = grade ;
    }
    void print(){
        System.out.println("NAME :"+name);
        System.out.println("AGE :"+age);
        System.out.println("GRADE :"+grade);
        System.out.println("---------------------");
    }
}
public class Student {
    public static void main(String[] args) {
            Students s1 = new Students("ADITYA",19,9.4);
            Students s2 = new Students("HARSHI",19,9.9);
            s1.print();
            s2.print();
    }
}
