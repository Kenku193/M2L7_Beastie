package org.example;

public class Main3 {

    public static void main(String[] args) {

        int numMonth = 1;

        Month vacation = switch (numMonth) {
            case 12, 1, 2 -> {
                System.out.println("Winter!");
                yield new WinterMonth();
            }
            case 3, 4, 5 -> {
                System.out.println("Spring!");
                yield new SpringMonth();
            }
            case 6, 7, 8 -> {
                System.out.println("Summer!");
                yield new SummerMonth();
            }
            case 9, 10, 11 -> {
                System.out.println("Autumn!");
                yield new AutumnMonth();
            }
            default -> new Month();
        };

        System.out.println(vacation.getClass().getSimpleName());
        if (vacation instanceof SummerMonth m){
            ((SummerMonth) vacation).swim();
            // ИЛИ
            m.swim();
        }


        switch (numMonth) {
            case 12, 1, 2 -> System.out.println("Winter!");
            case 3, 4, 5 -> System.out.println("Spring!");
            case 6, 7, 8 -> System.out.println("Summer!");
            case 9, 10, 11 -> System.out.println("Autumn!");
            default -> System.out.println("Incorrect data!");
        }

        switch (numMonth) {
            case 1:
                System.out.println("Winter!");
                break;
            case 2:
                System.out.println("Winter!");
                break;
            case 4:
                System.out.println("Spring!");
                break;
            case 7:
                System.out.println("Summer!");
                break;
            case 12:
                System.out.println("Winter!");
            default:
                System.out.println("Incorrect data!");
        }
    }
}
