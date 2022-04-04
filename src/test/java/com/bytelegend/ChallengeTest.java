package com.bytelegend;

import com.github.hcsp.test.helper.ProjectSourceFileReader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ChallengeTest {
    @Test
    public void test() {
        int size = new Random().nextInt(10) + 1;
        Assertions.assertNull(Challenge.getLength(null));
        Assertions.assertEquals(-1, Challenge.getLength(new Object()));
        Assertions.assertEquals(size, Challenge.getLength(new int[size]));
        Assertions.assertEquals(size, Challenge.getLength(new double[size]));
        Assertions.assertEquals(size, Challenge.getLength(new long[size]));
        Assertions.assertEquals(size, Challenge.getLength(new short[size]));
        Assertions.assertEquals(size, Challenge.getLength(new float[size]));
        Assertions.assertEquals(size, Challenge.getLength(new char[size]));
        Assertions.assertEquals(size, Challenge.getLength(new byte[size]));
        Assertions.assertEquals(size, Challenge.getLength(new Object[size]));
        Assertions.assertEquals(size, Challenge.getLength(new String[size]));
        Assertions.assertEquals(
                size,
                Challenge.getLength(IntStream.range(0, size).boxed().collect(Collectors.toList())));
        Assertions.assertEquals(
                size,
                Challenge.getLength(IntStream.range(0, size).boxed().collect(Collectors.toSet())));
        Assertions.assertEquals(
                size,
                Challenge.getLength(
                        IntStream.range(0, size)
                                .boxed()
                                .collect(Collectors.toMap(i -> i, i -> i))));
    }

    // TODO: Use javaparser once https://github.com/javaparser/javaparser/issues/3328 is resolved
    @Test
    public void noIfElse() {
        String source =
                ProjectSourceFileReader.readAsString(Challenge.class).replace("`if`/`else`", "");
        Assertions.assertFalse(source.contains("if"));
        Assertions.assertFalse(source.contains("else"));
    }
}
