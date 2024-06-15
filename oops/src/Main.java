public class Main {
    public static void main(String[] args) {
//        Student kunal = new Student(); //new keyword is used to dynamically allocate memory i.e allocating memory at runtime
//        kunal.rollno = 13;
//        kunal.name = "kunal k";
//        kunal.marks = 89.4F;
//        System.out.println(kunal.rollno);
//        System.out.println(kunal.name);
//        System.out.println(kunal.marks);

        Student two = new Student(23,"sarvagya", 45.4f);//new keyword is used to dynamically allocate memory i.e allocating memory at runtime
        System.out.println(two.name);
    }
}

class Student {
    int rollno;
    String name;
    float marks;


    Student (){ //default constructor
        this.rollno = 34;
        this.name = "person x";
        this.marks = 36.6f;
    }
    Student (int rollno, String name, float marks){ //parametric constructor
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    @Override
    protected void finalize() throws Throwable { //garbage collection, we do not have destructor in java so we cannot destroy objects but when java is destroying the object itself we can tell java to perform some actions when it destroy the object, i.e know as garbage collection
        System.out.println("object is destroyed");
    }
}