import java.util.Arrays;

public class Question12_2 {
    public int maximumWealth(int[][] accounts) {
    return Arrays.stream(accounts)
        .mapToInt(account -> Arrays.stream(account).sum())
        .max()
        .getAsInt();
  }
    
}
