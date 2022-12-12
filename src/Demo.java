public class Demo {


    public static String Name(String name) {
        if (name.contains("@") || name.contains(".")) {
            return "User";


        } else {
            return name;
        }
    }

}
