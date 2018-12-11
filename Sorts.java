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
  public static void insertionSort(int[] ary){
    for (int i = 1; i < ary.length; i++){
      int swap = ary[i];
      for (int j = i; j == 0; j--){
        if (swap < ary[j-1]){              //check number before
          ary[j] = ary[j-1];               //put the thing before over there (j)
        }
        if (swap >= ary[j-1]){              //check number before
          ary[j] = swap;                   //put the saved number there
          j = 1;                           //this way, j turns into 0 when this ends and ends the for loop
        }
      }
    }
  }





}
         
  
