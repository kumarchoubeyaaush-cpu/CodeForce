import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
public class C1430C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            
            // The minimum possible number left on the board is always 2 for n >= 2
            out.println(2);
            
            // First operation: merge n and n-1
            out.println(n + " " + (n - 1));
            
            // Subsequent operations: merge current result (which is i+2) with i
            // The value reduces from n down to 2
            for (int i = n - 2; i >= 1; i--) {
                // We are merging the number (i + 2) with i
                out.println((i + 2) + " " + i);
            }
        }
        
        out.flush();
    }
}  