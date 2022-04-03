package edu.bloomu.Bladen.Homework2;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Prints an array of x random dates and then orders them from least to greatest using
 * months at the sort
 * @author Nathaniel Bladen
 */
public class DateSort {
    public static void main(String[] args) {
        ThreadLocalRandom rand = ThreadLocalRandom.current();

        LocalDate[] localDates = new LocalDate[10];

        for (int i = 0; i < localDates.length; i++){
            localDates[i] = LocalDate.now().plusDays(rand.nextInt(0, 10001));
        }
        Arrays.sort(localDates, new DateComparator());

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        for (LocalDate order: localDates){

            System.out.println(order.format(f));
        }
    }
}
class DateComparator implements Comparator<LocalDate> {
    /**
     * Compares the value of two months within the array and returns the smallest one
     */
    @Override
    public int compare(LocalDate s1, LocalDate s2) {

        return s1.getMonthValue() - s2.getMonthValue();
    }

}