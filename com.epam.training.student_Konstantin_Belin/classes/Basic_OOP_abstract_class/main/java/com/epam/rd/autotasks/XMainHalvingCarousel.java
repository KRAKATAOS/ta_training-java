package classes.Basic_OOP_abstract_class.main.java.com.epam.rd.autotasks;

public class XMainHalvingCarousel {
    public static void main(String[] args) {
        CarouselRun run = new HalvingCarousel(7).run();
        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1

        DecrementingCarousel carousel = new HalvingCarousel(7);

        carousel.addElement(20);
        carousel.addElement(30);
        carousel.addElement(10);

        CarouselRun run2 = carousel.run();

        System.out.println(run2.isFinished()); //false

        System.out.println(run2.next()); //20
        System.out.println(run2.next()); //30
        System.out.println(run2.next()); //10

        System.out.println(run2.next()); //10
        System.out.println(run2.next()); //15
        System.out.println(run2.next()); //5

        System.out.println(run2.next()); //5
        System.out.println(run2.next()); //7
        System.out.println(run2.next()); //2

        System.out.println(run2.next()); //2
        System.out.println(run2.next()); //3
        System.out.println(run2.next()); //1

        System.out.println(run2.next()); //1
        System.out.println(run2.next()); //1

        System.out.println(run2.isFinished()); //true
        System.out.println(run2.next()); //-1
    }
}
