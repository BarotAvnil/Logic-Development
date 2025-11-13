// Find the Angle Between Clock Hands

import java.util.Scanner;

public class angleBetweenClockHand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours (0-11): ");
        int hours = sc.nextInt();
        System.out.print("Enter minutes (0-59): ");
        int minutes = sc.nextInt();
        if (hours == 12) hours = 0;
        if (minutes == 60) {
            minutes = 0;
            hours += 1;
            if (hours > 11) hours = hours - 12;
        }
        double hourAngle = (hours * 30) + (minutes * 0.5);
        double minuteAngle = minutes * 6;
        double angle = Math.abs(hourAngle - minuteAngle);
        angle = Math.min(360 - angle, angle);
        System.out.println("The angle between the clock hands is: " + angle + " degrees");
        sc.close();
    }
}

