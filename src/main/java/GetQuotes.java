import java.util.Random;

public class GetQuotes extends Quotes{

  public static String getRandomQuote(){
    String [] quotesArr = quotes.split("/");
    Random r = new Random();
    int low = 0;
    int high = quotesArr.length;
    int result = r.nextInt(high-low) + low;
    System.out.println(quotesArr[result]);
    return quotesArr[result];
  }
}
