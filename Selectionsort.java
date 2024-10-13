import java.util.Random;

public class Selectionsort {
public static void main(String[] args) {
    int n = 100000;
    int nums[] = new int[n];
    Random r = new Random();
    for(int i=0; i<n; i++)nums[i]=r.nextInt(1,100);
    Selectionsort in = new Selectionsort();
    in.sort(nums);
    for(int i=0; i<n; i++){
    System.out.printf(nums[i]+"->");
}}
public void sort(int [] nums){
    int n = nums.length;
    int min;
    int minind;
    for(int i=1; i<n; i++)
   { min=i;
    minind=i;
    for(int j=i+1; j<n; j++)
    { if(nums[j]<min){ min = nums[j]; minind=j;}

    }
swap(nums, minind, i);
} 

}
public void swap(int []nums, int one, int two)
{
    int tmp = nums[one];
    nums[one]=nums[two];
    nums[two]=tmp;
}
}
