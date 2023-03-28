public class cars {
    public static void main(String[] args) {
        car s = new car();
        s.model = "swift";
        //s.price = 1;
        s.mileage = 20.3;
        System.out.println(s.mileage);
        s.setPrice(89);
        System.out.println(s.getPrice());
    }
}
