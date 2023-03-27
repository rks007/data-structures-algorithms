public class Main {
    public static class Student{   // creating a class
        String name;
        int rno;
        double percentage;
    }
    public static void main(String[] args) {
        Student x = new Student();//declaring space according to the student class
        x.name = "abccce";
        x.rno = 30;
        x.percentage = 99;
        System.out.println(x.name);

        Student y = new Student();
        y.name = "xyz";
        y.rno = 56;
        y.percentage = 92;
        System.out.println(y.percentage);
    }
}