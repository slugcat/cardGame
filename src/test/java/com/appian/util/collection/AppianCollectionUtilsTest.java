package com.appian.util.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class AppianCollectionUtilsTest {
    @Test
    public void shufflePositionAverageTest() throws Exception {
        Random rand = new Random(42);
        final int len = 60; // very composite, *may* exacerbate modulo effects. Gotta pick something!
        final int runLen = 1_000_000;
        int[][] positionByRun = new int[len][runLen];
        for (int run = 0; run < runLen; ++run) {
            List<Integer> list = makeSortedIntList(len);
            AppianCollectionUtils.shuffle(list, rand);

            for (int pos = 0; pos < len; ++pos) {
                positionByRun[pos][run] = list.get(pos);
            }
        }
        // TODO implement other statistical methods of gauging quality of shuffle, eg chi-squared
        for (int pos = 0; pos < len; ++pos) {
            double avgVal = avg(positionByRun[pos]);
            final double min = len * 0.49;
            final double max = len * 0.51;
            Assert.assertTrue("position=" + pos + " has average value=" + avgVal + " min allowed=" + min + " max allowed=" + max,
                    avgVal > min && avgVal < max);
        }
    }

    @Test
    public void shuffleExpected0Test() throws Exception {
        List<Integer> expectedList = Collections.emptyList();
        compareShuffledToExpected(expectedList);
    }

    @Test
    public void shuffleExpected1Test() throws Exception {
        List<Integer> expectedList = Collections.singletonList(0);
        compareShuffledToExpected(expectedList);
    }

    @Test
    public void shuffleExpected7Test() throws Exception {
        List<Integer> expectedList = Arrays.asList(3, 0, 2, 1, 5, 4, 6);
        compareShuffledToExpected(expectedList);
    }

    @Test
    public void shuffleExpected20Test() throws Exception {
        List<Integer> expectedList = Arrays.asList(13, 0, 11, 8, 16, 5, 7, 1, 9, 6, 4, 10, 15, 17, 2, 14, 12, 18, 19, 3);
        compareShuffledToExpected(expectedList);
    }

    @Test
    public void shuffleLinkedExpected20Test() throws Exception {
        List<Integer> expectedList = new LinkedList<>(Arrays.asList(13, 0, 11, 8, 16, 5, 7, 1, 9, 6, 4, 10, 15, 17, 2, 14, 12, 18, 19, 3));
        compareShuffledToExpected(expectedList);
    }

    private void compareShuffledToExpected(List<Integer> expectedList) {
        List<Integer> list = makeSortedIntList(expectedList.size());
        Random rand = new Random(expectedList.size()); // 17 is the most random random number!
        AppianCollectionUtils.shuffle(list, rand);
        Assert.assertEquals(expectedList, list);
    }

    private double avg(int[] ints) {
        double sum = 0;
        for (int anInt : ints) {
            sum += anInt;
        }
        return sum / ints.length;
    }

    private List<Integer> makeSortedIntList(int len) {
        List<Integer> list = new ArrayList<>(len);
        for (int i = 0; i < len; ++i) {
            list.add(i);
        }
        return list;
    }


}