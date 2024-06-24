public class Test {
    public static void main(String[] args) {
        System.out.println(new Test().canJump(new int[]{2,5,0,0}));
    }


        public boolean canJump(int[] nums) {
            int i = 0;
            int j = 0;
            while (i < nums.length - 1) {
                if (nums[i] == 0) {
                    boolean flag = false;
                    for (int backup = i - 1; backup > j; j--) {
                        if (nums[backup] != 0) {
                            j = backup;
                            i = backup + nums[backup];
                            flag = true;
                            break;
                        }
                    }
                    if (!flag)
                    return false;
                } else {
                j = i;
                i += nums[i];
                }
            }
            return true;
        }
        int x = 5;
        System.out.println("Hello World" + x);
    }
}
