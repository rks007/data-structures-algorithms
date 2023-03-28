public class Main {

    public static void main(String[] args) {
        Student x = new Student();//declaring space according to the student class
        x.name = "abccce";
        x.rno = 30;
        x.percentage = 99;
        System.out.println(x.name);
        System.out.println(x.rno);
        System.out.println(x.percentage);
        System.out.println(x.schoolname);

        Student y = new Student("anmol",45,98);//by the help of constructor
        System.out.println(y.name);
        System.out.println(y.rno);
        System.out.println(y.percentage);
        System.out.println(x.schoolname);


    }
}