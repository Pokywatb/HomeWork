package waiterTask;

public class Client {
}

class ClientPut implements Runnable {

    private OrderStorage orderStorage;


    public ClientPut(OrderStorage orderStorage) {
        this.orderStorage = orderStorage;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + "отдал заказ официанту");

            try {
                Thread.sleep(700);
                orderStorage.putOrder1();
                Thread.yield();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ClientGet implements Runnable {
    private OrderStorage orderStorage;


    public ClientGet(OrderStorage orderStorage) {
        this.orderStorage = orderStorage;
    }

    @Override
    public void run() {
        while (true) {

            try {
                orderStorage.getOrder3();
                System.out.println(Thread.currentThread().getName() + "Получил заказ от повара");
                Thread.sleep(7000);
                Thread.yield();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

