public class BinarySearchRecc {
    public static int search(int[] arr, int target, int low, int high) {
        if (low > high) return -1; // Base case: not found

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) return mid; // Found it
        
        if (target < arr[mid]) 
            return search(arr, target, low, mid - 1); // Search left half
        
        return search(arr, target, mid + 1, high); // Search right half
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 12, 16, 23, 38};
        int result = search(nums, 16, 0, nums.length - 1);
        System.out.println("Element found at index: " + result);
    }
}