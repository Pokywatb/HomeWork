package waiterTask;

public class Chef {
}

class ChefPut implements Runnable {

    private OrderStorage orderStorage;


    public ChefPut(OrderStorage orderStorage) {
        this.orderStorage = orderStorage;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + "готовит заказ");

            try {
                Thread.sleep(1500);
                orderStorage.putOrder3();
                Thread.yield();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ChefGet implements Runnable {
    private OrderStorage orderStorage;


    public ChefGet(OrderStorage orderStorage) {
        this.orderStorage = orderStorage;
    }

    @Override
    public void run() {
        while (true) {

            try {
                orderStorage.getOrder2();
                System.out.println(Thread.currentThread().getName() + "Получил заказ от официанта");
                Thread.sleep(1000);
                Thread.yield();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

