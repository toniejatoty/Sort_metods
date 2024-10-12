
public class heapmoje {

    public static void main(String[] args) {
        int nums[] = { 1, 3, 2, 6, 2, 5, 2, 1, 5, 3, 2, 7, 3, 2, 1, 3, 5, 7, 2, 3, 4, 1, 2, 3, 4, 5, 6 };
        heapmoje h = new heapmoje();
        h.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d ", nums[i]);
        }
    }

    public void heapyfy(int[] nums, int n, int i) {//to jak masz i to poprawia kopiec wzgledem tego argumentu sprawdza i oraz dwie nogi od i 
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int large = i;
        if (left < n && nums[left] > nums[large])
            large = left;
        if (right < n && nums[right] > nums[large])
            large = right;

        if (large != i) {
            swap(nums, large, i);
            heapyfy(nums, n, large);
        }
    }

    public void swap(int[] nums, int one, int two) {
        if (one == two)
            System.out.println(one + " asds------------" + two);
        if (one != two) {
            int tmp = nums[one];
            nums[one] = nums[two];
            nums[two] = tmp;
        }
    }

    public void sort(int[] nums) { //to najpierw tworrzy kopiec a potem pojedyńczo ogarnia i poprawia kopiec
        int n = nums.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapyfy(nums, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            swap(nums, i, 0);
            heapyfy(nums, i, 0);
        }

    }
}
