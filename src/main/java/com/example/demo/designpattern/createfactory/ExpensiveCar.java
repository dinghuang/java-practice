package com.example.demo.designpattern.createfactory;

/**
 * @author dinghuang123@gmail.com
 * @since 2018/7/18
 */
public class ExpensiveCar implements Car {

    @Override
    public void run() {
        System.out.println("expensiveCar.run");
    }
}
