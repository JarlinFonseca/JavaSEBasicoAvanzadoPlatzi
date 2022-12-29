package com.anncode.enumerations;

public class IndexEnum {
    public static void main(String[] args) {


        System.out.println(Days.MONDAY.getSpanish());
        indicarDiasSemana(Day.FRIDAY);

    }

    private static void indicarDiasSemana(Day day) {

        switch (day) {
            case MONDAY:
                System.out.println("Monday are bad");
                break;

            case FRIDAY:
                System.out.println("Friday are better");
                break;

            case SUNDAY: case SATURDAY:

                System.out.println("Friday are better");
                break;

            default:{

                System.out.println("Midweek days are so-so");
                break;
            }

        }
    }
}
