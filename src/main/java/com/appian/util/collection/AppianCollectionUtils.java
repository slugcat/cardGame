package com.appian.util.collection;

import java.util.*;

/**
 * Utilities for manipulating collections. Use your imagination and pretend this is in another maven project, the real
 * one for Appian utilities.
 */
public class AppianCollectionUtils {

    // Prevent instantiating this class.
    private AppianCollectionUtils() {
    }

    /**
     * Rearranges a list in place such that the order is random.  It takes linear time.
     *
     * @param list   the list to be shuffled
     * @param random the source of randomness.  For a truly unpredictable shuffle this must be high quality, and if
     *               pseudo-random with large period.
     */
    public static void shuffle(List<?> list, Random random) {
        if (list instanceof RandomAccess) {
            shuffleRandomAccess(list, random);
        } else {
            List raList = new ArrayList<>(list);
            shuffleRandomAccess(raList, random);
            list.clear();
            list.addAll(raList);
        }
    }

    /**
     * Takes linear time assuming the list is RandomAccess.
     *
     * @param list   shuffle this, buddy
     * @param random source of randomness
     */
    private static void shuffleRandomAccess(List<?> list, Random random) {
        for (int i = 0; i < list.size(); i++) {
            int randVal = random.nextInt(list.size() - i);
            Collections.swap(list, i, i + randVal);
        }
    }

}
