import java.io.*;

public class Cisla {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("in.txt"));
            int suma =0;
            int cislakurva = 0;

            String[] cislapole = {};
            String nextLine = br.readLine();

            for (int i =0; nextLine != null; i++){

                if (cislapole.equals("N")){
                    suma = suma - cislakurva;
                }
                if (cislapole.equals("P")){
                    suma = suma + cislakurva;
                }
                cislapole[i] += nextLine;
                nextLine = br.readLine();

            }

            for (int i = 0; i < cislapole.length; i++) {
                cislapole = cislapole[i].split(" ");
                String scitaniodcitani = cislapole[0];

                cislakurva = Integer.parseInt(cislapole[1]);
            }
            br.close();

            System.out.println(suma);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
