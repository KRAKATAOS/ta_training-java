package classes.Basic_OOP_abstract_class.main.java.com.epam.rd.autotasks;

public class DecrementingCarouselWithLimit extends CarouselRun {
    private int actionLimit;
    private int decrement = 1;
    private int summ = 0;

    public DecrementingCarouselWithLimit(int actionLimit) {

        this.actionLimit = actionLimit;

    }


    @Override
    public int next() {
        int beforeDecreasing;

        if (isFinished() || actionLimit == summ)

            return -1;

        else {
            beforeDecreasing = array[position];
            array[position] -= decrement;
            summ ++;

            do {
                position++;
            }
            while (array[position %= array.length] <= 0 && !isFinished());

            if(actionLimit == summ){
                int [] finishArray = new int[7];
                array = finishArray;
            }

        }

        return beforeDecreasing;
    }
}