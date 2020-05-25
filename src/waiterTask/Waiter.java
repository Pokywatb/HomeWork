package waiterTask;

public class Waiter {
}

class WaiterPut implements Runnable {

    private OrderStorage orderStorage;


    public WaiterPut(OrderStorage orderStorage) {
        this.orderStorage = orderStorage;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + "отдал заказ повару");

            try {
                Thread.sleep(900);
                orderStorage.putOrder2();
                Thread.yield();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class WaiterGet implements Runnable {
    private OrderStorage orderStorage;


    public WaiterGet(OrderStorage orderStorage) {
        this.orderStorage = orderStorage;
    }

    @Override
    public void run() {
        while (true) {

            try {
                orderStorage.getOrder1();
                System.out.println(Thread.currentThread().getName() + "Получил заказ от клиента");
                Thread.sleep(800);
                Thread.yield();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

