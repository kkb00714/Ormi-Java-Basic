package chap04;

public class Condition2 {
    public static void main(String[] args) {
        int month = 3;
//        int month = Integer.parseInt(args[0]);
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
                monthString = "Invalid month";   // 유효하지 않은 범위의 값을 입력받았을 때 예외처리
                break;
        }
        System.out.println(monthString);

        String day = args[0];
        switch (day) {
            case "월요일" -> System.out.println("Start of the work week");
            case "화요일" -> System.out.println("Midweek");
            case "수요일" -> System.out.println("Midweek");
            case "목요일" -> System.out.println("Midweek");
            case "금요일" -> System.out.println("Almost weekend");
            default -> System.out.println("Invalid Day");
        }

    }
}