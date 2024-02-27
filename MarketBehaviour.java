package Sem2;

interface MarketBehaviour {
    void takeInQueue(Actor actor);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();

}