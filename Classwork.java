public class Classwork
{
  public static void main(String[] args)
  {
    // test your code here
    
  }

  public static String firstLastN(String word, int n) {
    String output = new String();
    String firstN = word.substring(0, n); // first n letters; substring from 0 to n-1
    int indexofNToLast = word.length() - n; //index of the nth to last letter
    String lastN = word.substring(indexofNToLast); // last n letters, starting at nth to last letter

    output = firstN + lastN;
    return output; 
  }

  public static String delEnd(String bord, int b) {
    String output = new String();
    int b = world.length() - b;
  }

  // write solutions to problems below

}
