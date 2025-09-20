import java.util.*;

class numbersinstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String nums = "";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                nums = nums + str.charAt(i);
            } else {
                if (!nums.isEmpty()) {
                    sum += Integer.parseInt(nums);
                    nums = "";
                }
            }
        }
        if (!nums.isEmpty()) {
            sum += Integer.parseInt(nums);
        }
        System.out.println(sum);
        sc.close();
    }
}
