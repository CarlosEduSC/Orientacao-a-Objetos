import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercicio {
    
    public static void main (String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i;
        int[] vetA = new int[5];

        for(i=0;i < 5;i++) {

            System.out.println("\nDigite o numero da posicao "+(i+1)+": ");
            vetA[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println("\n==========//==========\n");

        String[] vetB = new String[5];

        for(i=0;i < 5;i++) {

            System.out.println("\nDigite a palavra da posicao "+(i+1)+": ");
            vetB[i] = reader.readLine();
        }

        System.out.println("\n==========//==========\n");

        int j;

        for(i=0;i < 5;i++) {
            for (j=0;j < vetA[i];j++) {
                System.out.println (vetB[i]);
            }
        }
    }
}
