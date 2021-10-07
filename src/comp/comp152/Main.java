package comp.comp152;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        WeekDay deliveryDay = WeekDay.Friday;
        var picker = new Random();
        var choice = picker.nextInt(WeekDay.values().length);
        deliveryDay = WeekDay.values()[choice];
        System.out.println("Your delivery will happen on " + deliveryDay + ".");
    }
}
