public class EnumDemo {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {
        Day today = Day.FRIDAY;
        switch (today) {
            case FRIDAY:
                System.out.println("It's Friday!");
                break;
            default:
                System.out.println("It's not Friday.");
        }
    }
} 