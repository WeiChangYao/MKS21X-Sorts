public class Sorts{
  public static void selectionsort(int [] ary){
    for (int j = 0; j < ary.length - 1; j++){  //-1 because you dont need to sort last number
      int min = ary[j];                    //starting number
      int minIndex = j;                    //index for swapping later
      for (int i = j; i < ary.length; i++){//going through the array to get smallest number, starting from j
        if (min > ary[i]){
          min = ary[i];                    //if it's less, it becomes the new min
          minIndex = i
        }
      int swap = ary[j];                   //put original number into new thing
      ary[minIndex] = swap;
      ary[j] = min;                        //smallest number is in index j
      }
    }
  }
}
         
  
