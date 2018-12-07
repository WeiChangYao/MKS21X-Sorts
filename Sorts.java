public class Sorts{
  public static void selectionSort(int [] ary){
    for (int j = 0; j < ary.length - 1; j++){  //-1 because you dont need to sort last number
      int min = ary[j];                    //starting number
      int minIndex = j;                    //index for swapping later
      for (int i = j; i < ary.length; i++){//going through the array to get smallest number, starting from j
        if (ary[i] < min){
          min = ary[i];                    //if it's less, it becomes the new min
          minIndex = i;
        }
      }
    int swap = ary[j];                   //put original number into new thing
    ary[minIndex] = swap;
    ary[j] = min;                        //smallest number is in index j
    }
  }

  public static void bubbleSortHelper(int[] ary){//this is part of the bubble sort
    for (int j = 0; j < ary.length-1; j++){//goes through array
      if (ary [j] > ary [j+1]){            //to find if something's larger
        int swap = ary[j];                 //saves orignial number
        ary[j] = ary[j+1];                 //puts new number in original's place
        ary[j+1] = swap;                   //puts original number in new num's place
      }
    }
  }
      


/*public static String printArray(int[] ary) {  
    String output = "[";
    for(int i=0; i<ary.length-1; i++) {
      output += ary[i] + ", ";
    }
    return output += ary[ary.length-1] + "]";
}

public static void main(String[] args) {     //tests things in terminal
  int [] a = new int [args.length];          //add things into array a
  for (int i = 0; i < a.length; i++){
    a[i] = Integer.parseInt(args[i]);
  }
  System.out.println(printArray(a));         
  selectionSort(a);                          //sorts array a
  System.out.println(printArray(a));         //prints it
}*/



}
         
  
