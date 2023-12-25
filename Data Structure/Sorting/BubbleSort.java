package Sorting;

public class BubbleSort {

  public static void main(String args[]) {
    BubbleSort ob = new BubbleSort();
    int arr[] = { 64, 34, 25, 12, 22, 11, 90 };

    ob.bubbleSort(arr);
    System.out.println("Sorted array");
    ob.printArray(arr);
  }

  void bubbleSort(int arr[]) {
    int length = arr.length;

    for (int i = 0; i < length - 1; i++) {
      for (int j = 0; j < length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          // * swap arr[j+1] and arr[j];
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  // * Prints the array
  void printArray(int arr[]) {
    int length = arr.length;
    for (int i = 0; i < length; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
}
