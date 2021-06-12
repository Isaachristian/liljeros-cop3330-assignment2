package ex31;

public class heartTableGenerator {

    public static String generateTable(int age, int restingPulse) {
        StringBuilder table = new StringBuilder();

        table.append(String.format("%-12s | %-7s%n", "Intensity","Rate"));
        table.append("-------------|--------\n");

        for (int percentage = 55; percentage <= 95; percentage += 5) {
            String percStr = percentage + "%";
            table.append(String.format("%-12s | %-7s%n", percStr, calculateBPM(age, restingPulse, (percentage / 100.0)) + " bpm"));
        }

        return table.toString();
    }

    private static String calculateBPM(int age, int restingPulse, double intensity) {
        //TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR

        return (int) ((((220 - age) - restingPulse) * intensity) + restingPulse) + "";
    }

}
