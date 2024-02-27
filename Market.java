package Sem2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {
    public List<Actor> actors = new ArrayList<>();

    // Добавить человека в очередь.
    @Override
    public void takeInQueue(Actor actor) {
        actors.add(actor);
    }

    // Принять заказ.
    @Override
    public void takeOrders() {
        System.out.println("Заказ принят в обработку:" + actors.get(0));
        giveOrders();

    }

    // Выдать заказ.
    @Override
    public void giveOrders() {
        System.out.println("Заказ выполнен: " + actors.get(0));
        releaseFromQueue();

    }

    // Удалить человека из очереди.
    @Override
    public void releaseFromQueue() {
        System.out.println("До свидания, " + actors.get(0));

    }

    //
    @Override
    public void acceptToMarket(Actor actor) {
        if (actor.isMakeOrder) {
            takeOrders();
        } else {
            System.out.println("Вашего заказа нет. До свидания! " + actors.get(0));
        }

    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        actors.remove(0);
        update();
    }

    @Override
    public void update() {
        if (!actors.isEmpty()) {
            acceptToMarket(actors.get(0));
            releaseFromMarket(actors);
        } else {
            System.out.println("Очередь пуста.");
        }

    }

}
