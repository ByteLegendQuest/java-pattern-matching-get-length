package com.bytelegend;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(getLength(null));
        System.out.println(getLength(Arrays.asList(1, 2, 3)));
        System.out.println(getLength(new HashMap<String, Object>()));
        System.out.println(getLength(new int[] {1}));
    }

    /**
     * `getLength(Object obj)` method checks the type of the parameter and returns its length.
     *
     * <p>If the parameter is `null`, it returns `null`.
     *
     * <p>If the parameter is `Collection` type, it returns `Collection.size()` value.
     *
     * <p>If the parameter is `Map` type, it returns `Map.size()` value.
     *
     * <p>If the parameter is array type, it returns `length` property of the array.
     *
     * <p>Otherwise, it returns `-1`.
     *
     * <p>**Note: `if`/`else` statements are not allowed, you can only use [JEP 406: Pattern
     * Matching for switch](https://openjdk.java.net/jeps/406)**
     */
    public static Integer getLength(Object obj) {
        switch (obj) {
            case null -> {
                return null;
            }
            case Collection c -> c.size();
            case Map map -> map.size();
            case byte[] array -> {
                return array.length;
            }
            case short[] array -> {
                return array.length;
            }
            case int[] array -> {
                return array.length;
            }
            case long[] array -> {
                return array.length;
            }
            case float[] array -> {
                return array.length;
            }
            case double[] array -> {
                return array.length;
            }
            case char[] array -> {
                return array.length;
            }
            case Object[] array -> {
                return array.length;
            }
            default -> {
                return -1;
            }
        }
        return 0;
    }
}
