public class NameFormatter {

    private NameFormatter() {
    }

    public static String format(String firstName, String lastName){
        return lastName + ", " + firstName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
        return String.format("%s, %s. %s %s, %s%n", lastName, prefix, firstName, middleName, suffix);
    }

    public static String format(String fullName){
        return fullName;

    }
}
