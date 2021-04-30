import java.io.*;
import java.util.*;

public class Main {

  public static int findPivot(int[] arr) {
    // write your code here
    int start = 0;
    int end = arr.length-1;
    int N = arr.length;
    
    while(start <= end){
        int mid = start + (end-start)/2;
        int next = (mid+1)%N;
        int prev = (mid+N-1)%N;
        if(arr[mid]<=arr[next] && arr[mid]<=arr[prev]){
            return arr[mid];
        }
        if(arr[start] <= arr[mid]){
            start = mid+1;
        }
        else if(arr[mid] <= arr[end]){
            end = mid-1;
        }
    }
    return arr[start];
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int pivot = findPivot(arr);
    System.out.println(pivot);
  }

}