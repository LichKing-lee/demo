package com.fastcampus;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by LichKing on 2016. 11. 21..
 */
public class first {
    public static void main(String[] args) {
        String name = "김지수,정훈,권용근,이창용,오이택,신지훈,장선우,장옥원,오유경,서인용,최중현,곽대용,강홍구,왕지윤,허섬비,이기영,이지만,서무교,이영진,김종배,김태현,박재성";
        List<String> names = Arrays.asList(name.split(","));
        Collections.shuffle(names);

        for(int i = 0; i < names.size(); i+=2){
            System.out.println(names.get(i) + ", " + names.get(i + 1));
        }
    }
}
