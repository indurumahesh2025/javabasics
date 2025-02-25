package java_basics;

public class ControlFlow {
    public static void main(String[] args) {

        boolean hungry = true;
        if (hungry) {
            System.out.println("I'm starving...");
        } else {
            System.out.println("I'm not hungry.");
        }


        // Another example with an int
        int hungerLevel = 5;
        if (hungerLevel < 6) {
            System.out.println("I'm not hungry.");
        } else {
            System.out.println("I'm hungry.");
        }


        // Another example with a String
        int favoriteTemp = 75;
        int currentTemp = 75;
        String opinion;
        if(currentTemp == favoriteTemp) {
            if (currentTemp <= favoriteTemp - 30) {
                opinion = "It's pretty darn cold.";
            } else if (currentTemp < favoriteTemp - 20) {
                opinion = "It's kinda cold.";
            } else if (currentTemp > favoriteTemp + 10) {
                opinion = "It's hot.";
            } else {
                opinion = "It's a beautiful day.";
            }
        }else{
            opinion = "unknown temperature";
        }
        System.out.println(opinion);



        // Switch statement example with an int
        int month = 6;
        String monthString;

        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);


    }
}
