package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    private static final Logger logger = LoggerFactory.getLogger(App.class);






        public static double calculate(List<Long> numbers) {
            int size = numbers.size();
            double sum = 0.0;
            double mean = 0.0;
            double standardDeviation = 0.0;

            // Calculate the sum of the numbers
            for (long num : numbers) {
                sum += num;
            }

            // Calculate the mean of the numbers
            mean = sum / size;

            // Calculate the standard deviation of the numbers
            for (long num : numbers) {
                standardDeviation += Math.pow(num - mean, 2);
            }
            standardDeviation = Math.sqrt(standardDeviation / size);

            return mean;
        }

    public static void main( String[] args )
    {


        withIfCondition();
        withoutIfCondition();

    }

    private static void withIfCondition() {
        String a = "foo";

        long start = System.currentTimeMillis();

        for (int j = 0; j < 100_000_0; j++) {


            if (logger.isErrorEnabled()) {
                Exception e = new RuntimeException("test");
                logger.error("test " + e.getMessage() + a);
            }

        }
        // Get elapsed time in milliseconds
        long elapsedTimeMillis = System.currentTimeMillis()-start;

        System.out.println("withif took " + elapsedTimeMillis + " milliseconds");
    }

    private static void withoutIfCondition() {
        String a = "foo";

        long start = System.currentTimeMillis();

        for (int j = 0; j < 100_000_0; j++) {


                Exception e = new RuntimeException("test");
                logger.error("test " + e.getMessage() + a);


        }
        // Get elapsed time in milliseconds
        long elapsedTimeMillis = System.currentTimeMillis()-start;

        System.out.println("without if took " + elapsedTimeMillis + " milliseconds");
    }
}
