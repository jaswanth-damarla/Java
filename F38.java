// Main class
public class F38 {
    public static void main(String[] args) {
        String arr[] = {"sun", "earth", "mars", "mercury"};
        int si = 0;
        int ei = arr.length - 1;

        F38 hw = new F38(); // Create an instance to call non-static methods
        hw.MergeSort(arr, si, ei);

        System.out.println("Sorted Array:");
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }

    public void MergeSort(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;

        // Recursively sort the two halves
        MergeSort(arr, si, mid);
        MergeSort(arr, mid + 1, ei);

        // Merge the sorted halves
        Merge(arr, si, mid, ei);
    }

    public void Merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];

        int i = si;       // Start index for left subarray
        int j = mid + 1;  // Start index for right subarray
        int k = 0;        // Start index for temporary array

        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) <= 0) { // Compare strings lexicographically
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
}
