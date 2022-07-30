package com.bytelegend;

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
        Integer ans;
        switch (obj) {
            case null -> ans = null;
            case Collection<?> c -> ans = c.size();
            case Map<?, ?> m -> ans = m.size();
            case int[] i -> ans = i.length;
            case double[] d -> ans = d.length;
            case long[] l -> ans = l.length;
            case short[] s -> ans = s.length;
            case float[] f -> ans = f.length;
            case char[] c -> ans = c.length;
            case byte[] b -> ans = b.length;
            case Object[] o -> ans = o.length;
            default -> ans = -1;
        }
        return ans;
    }
}
