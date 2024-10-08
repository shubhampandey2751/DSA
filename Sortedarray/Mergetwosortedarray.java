package Sortedarray;
import java.util.*;
public class Mergetwosortedarray{
  public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
    // write your code here
    int alen = a.length;
    int blen = b.length;
    int[] res = new int[alen + blen];
    int i = 0;
    int j = 0;
    int k = 0;
    // when there are elements in both the array
    while (i < alen && j < blen) {
      if (a[i] < b[j]) {
        res[k] = a[i];
        i++;
      } else {
        res[k] = b[j];
        j++;
      }
      k++;
    }
    while (i < alen) {
      res[k] = a[i];
      i++;
      k++;
    }
    while (j < blen) {
      res[k] = b[j];
      j++;
      k++;
    }
    return res;
  }
  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n]; 
    for (int i = 0; i < n; i++) {
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for (int i = 0; i < m; i++) {
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a, b);
    print(mergedArray);
    print(mergedArray);
    scn.close();
  }

}
