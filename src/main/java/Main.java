import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        HashSet<String> set = new HashSet<>();

        for(int i=1;i<=str.length();i++){
            for(int j=0;j+i-1<str.length();j++){
                set.add(str.substring(j,j+i));
            }

        }
        System.out.print(set.size());
    }
}