package ru.innopolis.stc12.gc;

import java.util.ArrayList;
import java.util.List;

public class BigData {
    private final Integer SIZE = 102_400;
    private List<String> list = new ArrayList<>();

    public BigData() {
        fill();
    }

    private void fill() {
        for (int i = 0; i < SIZE; i++) {
            list.add("some text" + i);
        }
    }
}
