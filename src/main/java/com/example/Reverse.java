package com.example;

import java.util.List;

public class Reverse {
    public static <T> void reverse(List<T> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            T temp = list.get(left);

            // { Add BlockTest - check swapped values
            list.set(left, list.get(right));
            list.set(right, temp);
            // }
            

            left++;
            right--;
        }
    }
}
