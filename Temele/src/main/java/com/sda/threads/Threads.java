package com.sda.threads;

import java.util.ArrayList;

public class Threads extends Thread {

    public int runOneThread(ArrayList list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i).toString();
            sum = sum + Integer.valueOf(temp);
        }
        return sum;
    }
////////////////////////////////////////////////////////////

    public int runTwoThreads1(ArrayList list) {
        int sum1 = 0;
        for (int i = 0; i < list.size() / 2; i++) {
            String temp = list.get(i).toString();
            sum1 = sum1 + Integer.valueOf(temp);
        }
        return sum1;
    }

    public int runTwoThreads2(ArrayList list) {
        int sum2 = 0;
        for (int i = list.size() / 2; i < list.size(); i++) {
            String temp = list.get(i).toString();
            sum2 = sum2 + Integer.valueOf(temp);
        }
        return sum2;
    }
//////////////////////////////////////////////////////////////

    public int runFourThreads1(ArrayList list) {
        int sum1 = 0;
        for (int i = 0; i < list.size() / 4; i++) {
            String temp = list.get(i).toString();
            sum1 = sum1 + Integer.valueOf(temp);
        }
        return sum1;
    }

    public int runFourThreads2(ArrayList list) {
        int sum2 = 0;
        for (int i = list.size() / 4; i < list.size() / 2; i++) {
            String temp = list.get(i).toString();
            sum2 = sum2 + Integer.valueOf(temp);
        }
        return sum2;
    }

    public int runFourThreads3(ArrayList list) {
        int sum3 = 0;
        for (int i = list.size() / 2; i < 3 * list.size() / 4; i++) {
            String temp = list.get(i).toString();
            sum3 = sum3 + Integer.valueOf(temp);
        }
        return sum3;
    }

    public int runFourThreads4(ArrayList list) {
        int sum4 = 0;
        for (int i = 3 * list.size() / 4; i < list.size(); i++) {
            String temp = list.get(i).toString();
            sum4 = sum4 + Integer.valueOf(temp);
        }
        return sum4;
    }

}
