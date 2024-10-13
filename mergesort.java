import java.util.Random;
import java.lang.System;

public class mergesort {
    public static void main(String[] args) {
        int n = 100;
        int nums[] = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++)
            nums[i] = r.nextInt(1, 100);
        mergesort in = new mergesort();
        in.sort(nums);
        for (int i = 0; i < n; i++) {
            System.out.printf(nums[i] + "->");
        
        }
    }

    public void sort(int[] nums) {
        if(nums.length==1) return;
        int mid = (0 + nums.length) / 2;
        int[] nums1 = new int[mid];
        System.arraycopy(nums, 0, nums1, 0, mid);
        int[] nums2 = new int[nums.length - mid];
        System.arraycopy(nums, mid , nums2, 0, nums.length - mid);
        sort(nums1);
        sort(nums2);
        int [] merged = merge(nums1, nums2);
        System.arraycopy(merged, 0, nums, 0, nums.length);
    }

    public int[] merge(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int merged[] = new int[n];
        int left = 0;
        int right = 0;
        int leftvalue=0;
        int rightvalue=0;
        int increment = 0;
        while (increment < n) {

            if (left < n1) {
                leftvalue = nums1[left];
            } else {
                for (int i = increment; i < n; i++)
                    merged[i] = nums2[right++];
                    return merged;
            }
            if (right < n2) {
                rightvalue = nums2[right];
            } else {
                for (int i = increment; i < n; i++)
                    merged[i] = nums1[left++];
                    return merged;
            }
            if (increment < n) {
                if (leftvalue <= rightvalue) {
                    merged[increment] = leftvalue;
                    left++;
                } else if (rightvalue < leftvalue) {
                    merged[increment] = rightvalue;
                    right++;
                }
            }

            increment++;
        }
        return merged;
    }

    public void swap(int[] nums, int one, int two) {
        int tmp = nums[one];
        nums[one] = nums[two];
        nums[two] = tmp;
    }
}
