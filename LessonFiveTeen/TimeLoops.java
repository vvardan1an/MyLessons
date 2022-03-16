package LessonFiveTeen;

public class TimeLoops {
    public static void main(String[] args) {
        int hour =0;

        OUTER:
        while (hour <= 6) {
            int minute = 0;
            MIDDLE:
            do {
                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }

                minute++;
                int second = 0;
                while (second <= 59) {
//                    if ((second * hour) > minute) {
//                        continue MIDDLE;
//                    }
                    System.out.println(hour + " : " + minute + " : " + second);
                    second++;
                }

            } while (minute < 59);
            hour++;

        }
    }
}
