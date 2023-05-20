public class Main {

    public static void main(String[] args) {
        double centimeters = convertToCentimeters(5, 11);
        System.out.println("Your height in centimeters is " + centimeters);
        centimeters = convertToCentimeters(75);
        System.out.println("Your height converted from inches to centimeters is " + centimeters);
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }
    public static double convertToCentimeters(int height) {
        double centimeters = height * 2.54;
        return centimeters;
    }
    public static double convertToCentimeters(int feet, int inches) {
        int height = (inches + (feet * 12));
        return convertToCentimeters(height);
    }
    public static String getDurationString(int seconds) {

        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);
    }
    public static String getDurationString(int minutes, int seconds) {
        if (seconds >= 0) {
            int hours = minutes / 60;

            int remainingMinutes = minutes % 60;

            int remainingSeconds = seconds % 60;
            return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
        } else {
            return "Invalid value";
        }
    }
}
