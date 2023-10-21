package PriorityQueueClass.SortingByNoOfVowels;

import java.util.Comparator;

public class SortVowelsComparatorC implements Comparator<String> {
    @Override
    public int compare(String x, String y) {
        if (countVowels(x) < countVowels(y))
            return -1;
        else if (countVowels(x) > countVowels(y))
            return 1;
        else
            return 0;
    }

    public int countVowels(String x) {
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                    || ch == 'u' || ch == 'U')
                count++;
        }
        return count;
    }
}
