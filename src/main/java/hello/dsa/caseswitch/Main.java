package hello.dsa.caseswitch;

public class Main {


    public static void main(String[] args) {

        String fruit = "apple";


        switch (fruit) {
            case "mango" -> System.out.println("1");
            case "apple" -> System.out.println("2");
            case "orange" -> System.out.println("4");
            case "dre" -> System.out.println("5");
            case "dull" -> System.out.println("6");
            default -> System.out.println("3");
        }

        int day=5;

        switch (day){
            case 1,2,3,5,4 -> System.out.println("WeekDay");
            case 6,7 -> System.out.println("6");


        }
    }
}
