// 704. Binary Search




import java.util.Arrays;
class question1 {
  public int search(int[] nums, int target) {
    final int i = Arrays.binarySearch(nums, target);
    return i < 0 ? -1 : i;
  }
}