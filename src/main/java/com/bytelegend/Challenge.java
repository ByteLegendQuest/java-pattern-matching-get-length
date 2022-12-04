package com.bytelegend;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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

        Integer integer = typeTester(obj);
        return integer;
    }
    static Integer typeTester(Object o) {
        switch (o) {
            case null     -> {return null;}
            case Collection collection -> {
                return collection.size();
            }
            case Map map  -> {

                return map.size();
            }
            case String[] ia -> {

                return ia.length;
            }
            case Object[] ia -> {

                return ia.length;
            }
            case int[] ia -> {

                return ia.length;
            }
            case double[] ia -> {

                return ia.length;
            }
            case long[] ia -> {

                return ia.length;
            }
            case short[] ia -> {

                return ia.length;
            }
            case float[] ia -> {

                return ia.length;
            }
            case char[] ia -> {

                return ia.length;
            }
            case byte[] ia -> {

                return ia.length;
            }
            default       -> {

                return -1;
            }
        }
    }

}
