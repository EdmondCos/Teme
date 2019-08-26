package com.sda.threads;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = getArrayList();

        long x = System.nanoTime();
        Threads th1 = new Threads();
        int a1 = th1.runOneThread(arrayList);
        System.out.print(a1 + "  ");
        long y = System.nanoTime();
        System.out.println("Time for one thread in nano: " + (y - x));


        x = System.nanoTime();
        Threads th2 = new Threads();
        int a2 = th2.runTwoThreads1(arrayList);
        int b2 = th2.runTwoThreads2(arrayList);
        System.out.print(a2 + b2 + " ");
        y = System.nanoTime();
        System.out.println("Time for two threads in nano: " + (y - x));


        x = System.nanoTime();
        Threads th4 = new Threads();
        int a4 = th4.runFourThreads1(arrayList);
        int b4 = th4.runFourThreads2(arrayList);
        int c4 = th4.runFourThreads3(arrayList);
        int d4 = th4.runFourThreads4(arrayList);
        System.out.print(a4+b4+c4+d4 + " ");
        y = System.nanoTime();
        System.out.println("Time for four threads in nano: " + (y - x));

    }

//    thread t1
//    thread t2
//    thread t3
//    thread t4
//    try{
//    t1.join
//    t2.join
//    t3.join
//    t4.join}
//    join obliga ca toate threadurile se se finalizeze inainte sa se execute ce-i după try.

    public static ArrayList<Integer> getArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }
}
