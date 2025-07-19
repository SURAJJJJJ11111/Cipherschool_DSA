import java.util.Arrays;

public class Question23_2 {
      public int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);

    int i = 0;
    for (final int cookie : s)
      if (i < g.length && g[i] <= cookie)
        ++i;

    return i;
  }
    
}
