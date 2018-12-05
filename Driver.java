public class Driver {
  
  public static String printArray(int[] ary) {
    String output = "[";
    for(int i=0; i<ary.length-1; i++) {
      output += ary[i] + ", ";
    }
    return output += ary[ary.length-1] + "]";
}

public static void main(String[] args) {
  int[] a = { 2, 1, 2};
  System.out.println(printArray(a));
  selectionSort(a);
  System.out.println(printArray(a));
}
}

 
