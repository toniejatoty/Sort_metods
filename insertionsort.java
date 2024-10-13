import java.util.Random;

public class insertionsort {
public static void main(String[] args) {
    int n = 100000;
    int nums[] = new int[n];
    Random r = new Random();
    for(int i=0; i<n; i++)nums[i]=r.nextInt(1,100);
    insertionsort in = new insertionsort();
    in.sort(nums);
    for(int i=0; i<n; i++){
    System.out.printf(nums[i]+"->");
}}
public void sort(int [] nums){
    int n = nums.length;
    int x;
    for(int i=1; i<n; i++)
    {x=nums[i];
        for(int j=i-1; j>=0; j--)
        {
        
            if(x<nums[j])swap(nums, j+1, j);
            else { break;}
        }
        
    }


}
public void swap(int []nums, int one, int two)
{
    int tmp = nums[one];
    nums[one]=nums[two];
    nums[two]=tmp;
}
}
