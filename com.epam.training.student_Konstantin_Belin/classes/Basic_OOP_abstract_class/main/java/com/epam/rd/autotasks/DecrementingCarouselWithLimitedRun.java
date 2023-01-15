package classes.Basic_OOP_abstract_class.main.java.com.epam.rd.autotasks;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel {
    private final int actionLimit;



    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {

        super(capacity);
        this.actionLimit = actionLimit;

    }
    @Override
    public CarouselRun run() {
        if (!isRun) {
            isRun = true;
            return new DecrementingCarouselWithLimit(actionLimit);
        }
        return null;
    }
}