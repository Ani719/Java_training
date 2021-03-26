public class Java_training4_1 {
    public static void main(String[] args) {
        System.out.println(getPermission(17));

    }
    static String getPermission(int age){
        if(age > 18)
            return "Allowed to enter the club";
        else
            return "Not allowed to enter the club";

    }
}
