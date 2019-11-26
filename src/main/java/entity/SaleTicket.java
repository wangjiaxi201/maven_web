package entity;

import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.function.Consumer;

public class SaleTicket {

    private int ticketCount = 30;

    public synchronized void saleTicket(){

        if(ticketCount>0){
            System.out.println(Thread.currentThread().getName()+"卖了第"+ticketCount--+"张票");
        }

    }

    public static void main(String[] args) {

        SaleTicket saleTicket = new SaleTicket();

        ExecutorService executorService = Executors.newCachedThreadPool();

        /*new Thread(()->{for(int i=0;i<=40;i++)saleTicket.saleTicket();},"AA").start();
        new Thread(()->{for(int i=0;i<=40;i++)saleTicket.saleTicket();},"BB").start();
        new Thread(()->{for(int i=0;i<=40;i++)saleTicket.saleTicket();},"CC").start();*/

        Arrays.asList("AA","BB","CC").forEach(name->{new Thread(()->{for(int i=0;i<=40;i++)saleTicket.saleTicket();},name).start();});
    }
}
