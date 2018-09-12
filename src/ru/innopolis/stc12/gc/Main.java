package ru.innopolis.stc12.gc;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    private static Timer timer = new Timer();
    private static List<BigData> bigDataList = new ArrayList<>();
    private static TimerTask taskAddToList = new TimerTask() {
        @Override
        public void run() {
            bigDataList.add(new BigData());
            System.out.println("added new BigData");
        }
    };
    private static TimerTask taskClearList = new TimerTask() {
        @Override
        public void run() {
            bigDataList.clear();
            taskAddToList.cancel();
            System.out.println("BigData list is clear, add is canceled");
        }
    };
    private static TimerTask taskCycleAddToList = new TimerTask() {
        @Override
        public void run() {
            new BigData();
        }
    };

    public static void main(String[] args) {
        timer.schedule(taskAddToList, 1000, 3000);
        timer.schedule(taskClearList, 30000);
        timer.schedule(taskCycleAddToList, 100, 100);
    }
}
