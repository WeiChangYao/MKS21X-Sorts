import java.util.Arrays;
public class Driver2{
  
  
  public static String printArray(int[] ary) {
    String output = "[";
    for(int i=0; i<ary.length-1; i++) {
      output += ary[i] + ", ";
    }
    return output += ary[ary.length-1] + "]";
}

  public static void main(String[]artie){
    int[] randish = {1,1,1,1,11,1,1,1,1,11,12,31,1,1 };
System.out.println(printArray(randish));   

int[] randish2 = Arrays.copyOf(randish,randish.length);
      int[] randish3 = Arrays.copyOf(randish,randish.length);
  
      Sorts.bubbleSort(randish2);
      Arrays.sort(randish3);
    
    System.out.println(printArray(randish2));   
System.out.println(printArray(randish3));  
    
     if( Arrays.equals(randish2,randish3)){
        System.out.println("Bubble Correct!");
      }else{
       System.out.println("Bubble BROKEN!!!!");
      }

    
  }
}