import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well

  private ArrayList<String> words;
  
  public RandomStringChooser(String[] arr) {
    words = new ArrayList<String>();
    for(String i : arr) {
      words.add(i);
    }
  }
  
  public String getNext() {
    if (words.size() > 0)
      return words.remove((int)(Math.random() * words.size()));
    return "NONE"; 
  }
}
