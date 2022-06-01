import java.util.Scanner;

class longPressedName {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name =sc.nextLine();
        String typed=sc.nextLine();
        System.out.println(isLongPressedName(name,typed));
    }
    
    public static boolean isLongPressedName(String name, String typed) {
        if (typed.length() < name.length()) {
            return false;
        }

        int i = 0;
        int j = 0;

        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }

        return i == name.length();
    }


}