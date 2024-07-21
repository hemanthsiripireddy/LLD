package org.example.builderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ObserverDesignPattern {

    public static void test(){
        Order order=new Order(1);
        Observer email=new EmailObserver();
        Observer sms=new SMSObserver();
        Observer notification=new NotificationObserver();
        order.attach(email);
        order.attach(sms);
        order.attach(notification);

        order.updateStatus("ready for dispatch");

        order.detach(notification);

        order.updateStatus("order is dispatched");
        order.updateStatus("order is out for delivery");
        order.updateStatus("order is delivered");
    }
}

class Order{

    private  String status;

    private int id;

    List<Observer> observerList;

    public Order(int id) {
        this.id = id;
        observerList=new ArrayList<>();
    }

    public void attach(Observer observer){
        observerList.add(observer);
    }
    public void detach(Observer observer){
        observerList.remove(observer);
    }

    public String getStatus() {
        return status;
    }


    public void notifyObservers(){
        for (Observer observer:observerList){
            observer.update(this);
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void updateStatus(String status){
        this.status=status;
        notifyObservers();
    }
}

interface  Observer{
    void update(Order order);
}

class SMSObserver implements Observer{

    @Override
    public void update(Order order) {
        System.out.println("SMS: your order with id "+order.getId()+" is "+order.getStatus());
    }
}

class EmailObserver implements Observer{

    @Override
    public void update(Order order) {
        System.out.println("Email: your order with id "+order.getId()+" is "+order.getStatus());
    }
}

class NotificationObserver implements Observer{

    @Override
    public void update(Order order) {
        System.out.println("Notification: your order with id "+order.getId()+" is "+order.getStatus());
    }
}
