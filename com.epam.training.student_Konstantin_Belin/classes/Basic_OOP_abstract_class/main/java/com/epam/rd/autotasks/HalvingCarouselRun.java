package classes.Basic_OOP_abstract_class.main.java.com.epam.rd.autotasks;


public class HalvingCarouselRun extends CarouselRun {

    @Override
    public int next() {

        int beforeDecreasing;
        boolean isFinished = isFinished();


        if (isFinished) {

            return -1;
        } else {
            beforeDecreasing = array[position];
            array[position] = array[position] / 2;
            position++;

        }

        while (array[position %= array.length] <= 0) {
            position++;
        }
        return beforeDecreasing;

    }
}


