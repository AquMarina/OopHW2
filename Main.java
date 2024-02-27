package Sem2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        market.takeInQueue(new Human("Vasy", true, false));
        market.takeInQueue(new Human("Pety", false, false));

        market.update(); // Принимаем первый заказ

    }

}
