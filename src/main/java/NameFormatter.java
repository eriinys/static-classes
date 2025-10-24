public class NameFormatter {

    private NameFormatter() {
    }

    public static String format(String firstName, String lastName){
        return lastName + ", " + firstName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
        return String.format("%s, %s. %s %s, %s", lastName, prefix, firstName, middleName, suffix);
    }

    public static String format(String fullName){ //make sure to prompt user when calling method in specific formatted order
        String[] parts = fullName.split("\\s+");
        String prefix = parts[0];
        String firstName = parts[1];
        String middleName = parts[2];
        String lastName = parts[3];
        String suffix = parts[4];

        return fullName;
    }
}
