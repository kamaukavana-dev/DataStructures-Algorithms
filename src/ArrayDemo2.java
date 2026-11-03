public class ArrayDemo2 {
    public static void main(String[] args) {
        String[] Sports = {"Football", "Chess", "Athletics", "Hockey", "Badminton", "Swimming"};
        String Shortest = Sports[0];
        for (String Sport : Sports) {
            if (Shortest.length() > Sport.length()) {
                Shortest = Sport;

            }
        }

    }
}