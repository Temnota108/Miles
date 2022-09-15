public class Main {
    public static void main(String[] args) {

        System.out.println("Расчет начисленных миль за купленный билет:");

        int ticketPrice = 9; // Ваша стоимость билета
        if (ticketPrice > 20) {
            int bonusPrice = 20; // стоимость одной начисленной мили
            int bonus = ticketPrice / bonusPrice;
            System.out.println("Вам начислено" + bonus + "миль");
        } else {
            System.out.println("Вам не начислены мили");
        }





    }
}
