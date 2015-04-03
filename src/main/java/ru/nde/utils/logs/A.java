package ru.nde.utils.logs;

/**
 * @author: Dmitriy E. Nosov <br>
 * @date: 04.04.15 1:37 <br>
 * @description: <br>
 */
public class A {
    int i;
    int j;


    public void inc() {
        i++;
        j++;
    }

    public void result() {
        System.out.println("i = " + i + " " + j);
    }
}
