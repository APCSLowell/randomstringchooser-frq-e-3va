import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well

  private String[] words;
  private int valuesRemaining;
  
  public RandomStringChooser(String[] arr) {
    words = new String[arr.length];
    for(int i = 0; i < words.length; i++) {
      words[i] = arr[i];
    }
    valuesRemaining = words.length;
  }
  
  public String getNext() {
    if (valuesRemaining == 0)
      return "NONE";
    int index = (int)(Math.random() * valuesRemaining);
    String selected = words[index];
    words[index] = words[valuesRemaining-1];
    valuesRemaining--;
    return selected;
  }
}
