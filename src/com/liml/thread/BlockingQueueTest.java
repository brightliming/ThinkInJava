package com.liml.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Administrator on 2016/2/25.
 */
public class BlockingQueueTest {
    private BlockingQueue basket = new LinkedBlockingQueue();

    private int productCount = 0;
    private int consumerCount = 0;

    public BlockingQueueTest(){
        product();
        product();
        consumer();
    }
    private void product(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 0;
                    while(i<1000){
                        basket.put("a apple");
                        productCount++;
                        i++;
                        System.out.println("===============product"+productCount);

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    private void consumer(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while(true){
                        String apple = (String)basket.take();
                        consumerCount++;
                        System.out.println(apple+"===============consumer"+consumerCount);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public static void main(String[] args){
        BlockingQueueTest test = new BlockingQueueTest();
    }
}
