import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well

  private String[] arr;
  private int valuesRemaining;
  
  public RandomStringChooser(String[] arr) {
    arr = new String[arr.length];
    for(int i = 0; i < arr.length; i++) {
      arr[i] = arr[i];
    }
    valuesRemaining = arr.length;
  }
  
  public String getNext() {
    if (valuesRemaining == 0) {
      return "NONE";
    }
    else {
      int index = (int)(Math.random() * valuesRemaining);
      String selected = arr[index];
      arr[index] = arr[valuesRemaining-1];
      valuesRemaining--;
      return selected;
    }
  }
}
