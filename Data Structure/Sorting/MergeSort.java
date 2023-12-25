package Sorting;

public class MergeSort {

  public static void main(String[] args) throws Exception {
    int[] arr = { 12, 11, 13, 5, 6, 7 };

    int[] sorted = mergeSort(arr, 0, arr.length - 1);
    for (int val : sorted) {
      System.out.print(val + " ");
    }
  }

  public static int[] mergeTwoSortedArrays(int[] one, int[] two) {
    int[] sorted = new int[one.length + two.length];
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < one.length && j < two.length) {
      if (one[i] < two[j]) {
        sorted[k] = one[i];
        k++;
        i++;
      } else {
        sorted[k] = two[j];
        k++;
        j++;
      }
    }
    if (i == one.length) {
      while (j < two.length) {
        sorted[k] = two[j];
        k++;
        j++;
      }
    }

    if (j == two.length) {
      while (i < one.length) {
        sorted[k] = one[i];
        k++;
        i++;
      }
    }
    return sorted;
  }

  public static int[] mergeSort(int[] arr, int low, int hight) {

    if (low == hight) {
      int[] baseResult = new int[1];
      baseResult[0] = arr[low];

      return baseResult;
    }

    int mid = (low + hight) / 2;

    int[] firstHalf = mergeSort(arr, low, mid);
    int[] secondHalf = mergeSort(arr, mid + 1, hight);

    int[] merged = mergeTwoSortedArrays(firstHalf, secondHalf);

    return merged;
  }
}
