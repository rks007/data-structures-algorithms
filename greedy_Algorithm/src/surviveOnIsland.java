public class surviveOnIsland {
    public static int minimumDays(int S, int N, int M){
        // code here
        /*
        s = days
        n = food limit per day
        m = required food for one day
        */
        int sundays = S / 7; //calculate the number on sundays
        int buyingDays = S - sundays;//calculate buying days

        int foodReq = S * M;//required food to survive for that given days

        int min = 0;

        if(foodReq % N == 0){
            min = foodReq / N;
        }
        else{
            min = (foodReq / N) + 1;
        }

        if(min <= buyingDays){
            return min;
        }
        return -1;
    }
    public static void main(String[] args) {
        int totalDaysofBuying = minimumDays(10,16,2);
        System.out.println(totalDaysofBuying);
    }
}
