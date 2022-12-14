import java.io.*;
class Test {
    public static void main(String[] args) {
        take();
    }

    static void take () {
        try {
            FileReader fr = new FileReader("x.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            System.out.println(s);
            br.close();
            fr.close();
            if (s == "Stone") {
                System.out.println("Lose");
            }
        }
        catch (IOException e){}
    }
}