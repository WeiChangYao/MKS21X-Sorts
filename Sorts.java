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
  
  public static void bubbleSort(int [] ary){
    int sortNum = 1;                         //counts number of times sorted
    for (int i = 0; i < ary.length && sortNum > 0 ; i++){ //as long as sorted is more than zero, it continues sorting normally
      sortNum = 0;                           //makes sure to reset sortNum...i fortgot to do that b4...
      for (int j = 0; j < ary.length-1-i; j++){//goes through array and minus one everytime
        if (ary [j] > ary [j+1]){            //see's if the thing infront is smaller. Then:
          int swap = ary[j];                 //saves orignial number
          ary[j] = ary[j+1];                 //puts new number in original's place
          ary[j+1] = swap;                   //puts original number in new num's place
          sortNum++;                         //adds one to sorted because it sorted
        }
      }
    }
  }
  

  public static void insertionSort(int[] ary){
    for (int i = 1; i < ary.length; i++){
      int swap = ary[i];                   //saves that integer
      for (int j = i; !(j == -1); j--){
        if (j == 0) {                      //once it hits the end, it puts it in
          ary[j] = swap;
        } else{
        if (swap < ary[j-1]){              //check number before
          ary[j] = ary[j-1];               //put the thing before over there (j)
        }
        else{                              //check number before
          ary[j] = swap;                   //put the saved number there
          j = 0;                           //this way, j turns into 0 when this ends and ends the for loop
        } }
      }
    }
  }





}
         
  
