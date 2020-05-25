package waiterTask;

public class Main {
    public static void main(String[] args) {
        OrderStorage orderStorage = new OrderStorage();

        new Thread(new ClientPut(orderStorage)).start();
        new Thread(new WaiterGet(orderStorage)).start();
        new Thread(new WaiterPut(orderStorage)).start();
        new Thread(new ChefGet(orderStorage)).start();
        new Thread(new ChefPut(orderStorage)).start();
        new Thread(new ClientGet(orderStorage)).start();



    }

}
