//we have created class in this file but we can use
// it in every file to create object for example you can see mainjava file is using student.java to create objects
public class Student{   // creating a class
    String name;
    int rno;
    double percentage;
    final String schoolname = "kvs"; // if final keyword is there i.e,no one can change the value assign to it but you can access it

    public Student(){ // default constructor

    }
    public Student(String name,int rno, double percentage){ //parametrized constructor
        this.name = name;
        this.rno = rno;
        this.percentage = percentage;
    }
}

