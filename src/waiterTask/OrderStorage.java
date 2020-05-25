package waiterTask;

import java.util.ArrayList;

public class OrderStorage {

    private ArrayList<Order> orders1 = new ArrayList<>();
    private ArrayList<Order> orders2 = new ArrayList<>();
    private ArrayList<Order> orders3 = new ArrayList<>();

    public ArrayList<Order> getOrders1() {
        return orders1;
    }

    public void setOrders1(ArrayList<Order> orders1) {
        this.orders1 = orders1;
    }

    public ArrayList<Order> getOrders2() {
        return orders2;
    }

    public void setOrders2(ArrayList<Order> orders2) {
        this.orders2 = orders2;
    }

    public ArrayList<Order> getOrders3() {
        return orders3;
    }

    public void setOrders3(ArrayList<Order> orders3) {
        this.orders3 = orders3;
    }

    public synchronized void putOrder1() throws InterruptedException {

        System.out.println("PUT_ORDER: клиент смотрит меню");

        while(orders1.size() > 1){
            notify();
            System.out.println("PUT_ORDER:  ожидает официанта. Заказов: " + orders1.size());
            wait();
        }
        orders1.add(new Order());
        System.out.println("PUT_ORDER: клиент добавил 1 заказ. Заказов: " + orders1.size());


    }
    public synchronized void getOrder1() throws InterruptedException{
        System.out.println("GET_ORDER: клиент диктует заказ");
        while(orders1.size() < 1){
            notify();
            System.out.println("GET_ORDER: официант принимает заказ. Заказов : " + orders1.size());
            wait();
        }
        if (orders3.size() > 0){
        orders3.remove(0);
        System.out.println("GET_ORDER: Уносит заказ повару. Заказов: " + orders1.size());}
    }

    public synchronized void putOrder2() throws InterruptedException {

        System.out.println("PUT_ORDER: начало выполнения");

        while(orders2.size() > 1){
            notify();
            System.out.println("PUT_ORDER: ожидание2. Заказов: " + orders2.size());
            wait();
        }
        orders2.add(orders1.get(0));
        orders1.remove(0);
        System.out.println("PUT_ORDER: официант добавил 1 заказ. Заказов: " + orders2.size());


    }
    public synchronized void getOrder2() throws InterruptedException{
        System.out.println("GET_ORDER: начало выполнения");
        while(orders2.size() < 1){
            notify();
            System.out.println("GET_ORDER: ожидание5. Заказов: " + orders2.size());
            wait();
        }

        System.out.println("GET_ORDER: повар забрал 1 заказ. Заказов: " + orders2.size());
    }


    public synchronized void putOrder3() throws InterruptedException {

        System.out.println("PUT_ORDER: начало выполнения");

        while(orders3.size() > 5){
            notify();
            System.out.println("PUT_ORDER: ожидание3. Заказов: " + orders3.size());
            wait();
        }
        orders3.add(orders2.get(0));
        orders2.remove(0);
        System.out.println("PUT_ORDER: повар добавил 1 заказ. Заказов: " + orders3.size());


    }
    public synchronized void getOrder3() throws InterruptedException{
        System.out.println("GET_ORDER: начало выполнения");
        while(orders3.size() < 1){
            notify();
            System.out.println("GET_ORDER: ожидание4. Заказов: " + orders3.size());
            wait();
        }

        System.out.println("GET_ORDER: клиент забрал 1 заказ. Заказов: " + orders3.size());
    }
}
