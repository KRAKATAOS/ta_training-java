package classes.Basic_OOP_abstract_class.main.java.com.epam.rd.autotasks;

public class CarouselRun {

    protected int[] array = DecrementingCarousel.carousel.clone();
    protected int position = 0;

    public int next() {
        if (isFinished())
            return -1;
        else {
            while (array[position %= array.length] <= 0) {
                position++;
            }
        }
        return array[position++]--;
    }

    public boolean isFinished() {
        for (int el : array)
            if (el > 0)
                return false;
        return true;
    }
}