package com.epam.training.student_Konstantin_Belin.classes.DecrementingCarousel;

public class DecrementingCarousel {
    private final int capacity;
    static int[] carousel;
    int index;
    boolean isRun;
    boolean isFinished;

    {
        index = 0;
        isRun = false;
        isFinished= true;

    }

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        carousel = new int[capacity];
    }

    public boolean addElement(int element){
        if (element > 0 && index < capacity && !isRun) {
            carousel[index++] = element;
            return true;
        }
        return false;
    }

    public CarouselRun run() {
        if (!isRun) {
            isRun = true;
            return new CarouselRun();
        }
        return null;
    }
}
