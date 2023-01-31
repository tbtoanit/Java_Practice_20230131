package buoi6;

public class BaiTap {
    public static void main(String[] args) {
        UCLN(9, 18);
    }

    public static void twoSum() {
        /*
         * https://leetcode.com/problems/two-sum/
         * Input: nums = [2,7,11,15], target = 9
         * Output: [0,1]
         * */
        int target = 9;
        int[] nums = {2, 7, 11, 15};
        boolean remark = false;
        for (int i = 0; i < nums.length; i++) {
            if (remark == true) {
                break;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(i + "--" + j);
                    remark = true;
                    break;
                }
            }
        }

    }

    public static boolean ktSNT(int x) {
        /*
         * 1. Viết Chương trình nhập vào 1 số và kiểm tra số đó có phải là số nguyên tố hay không?
         * */
        for (int i = 2; i <= x - 1; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void inSNTBeHonN(int n) {
        /*
         * viết chương trình in ra tất cả các số nguyên tố nhỏ hơn số n cho trước.
         */
        for (int z = 2; z < n; z++) {
            if (ktSNT(z) == true) {
                System.out.println(z);
            }
        }

    }


    public static void UCLN(int a, int b) {
        //a = 6, b = 18
        //i: 6 => 1
        int UCLN = 1;
        int minAB = Math.min(a, b);
        for (int i = minAB; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                break;
            }
        }

    }

    public static void BCNN(int a, int b) {
        int maxAB = Math.max(a, b);
        for (int i = maxAB; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println(i);
                break;
            }
        }
    }



}
