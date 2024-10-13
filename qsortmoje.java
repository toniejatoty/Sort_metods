import java.util.Random;
public class qsortmoje {
    public static void main(String[] args) {
        int n=10000000;
        Random r = new Random();
        int[] nums = new int[n];
        
        for(int i=0; i<n; i++)
        { nums[i] = r.nextInt(10, 100);

        }
        qsortmoje q = new qsortmoje();
        q.sort(nums);
        for (int i = 0; i < nums.length; i++)
            System.out.printf("%d-->", nums[i]);
    }

    public void sort(int[] nums) {
        validateargs(nums);
        qsort(nums, 0, nums.length -1);

    }

    public void qsort(int[] nums, int left, int right) {
    if(left>right)return;
        int left1 = left;
        int right1 = right;
        int mid = (left + right) / 2;
        int midvalue = nums[mid];
        while (true) {
            while (left <= right && nums[left] < midvalue)
                left++;
            while (right >= left && nums[right] > midvalue)
                right--;

            if (left <= right){
                swap(nums, left, right);
            left ++;
            right--;
            }
                if (left > right)
                break;
        }
        
            qsort(nums, left1, right );
            qsort(nums, left, right1);

        return;
    }

    public void swap(int[] nums, int one, int two) {
        int tmp = nums[one];
        nums[one] = nums[two];
        nums[two] = tmp;
    }

    public void validateargs(int[] nums) {
        if (nums == null)
            throw new NullPointerException("invalid atgs");
    }
}
