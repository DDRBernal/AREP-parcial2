package escuelaing.edu.co.arep_parcial2;

import java.util.ArrayList;

public class ServicePalindroma {

    ArrayList<String> palindroma;

    public ServicePalindroma(){
        palindroma = new ArrayList<>();
    }

    public void putPalindroma(String word){
        palindroma.add(word);
    }

    public boolean isPalindroma(String word){
        String[] wordP = word.split("");
        String[] newWord = new String[word.length()];
        int contador = wordP.length-1;
        for (int i = 0; i< wordP.length ; i++){
            newWord[i] = wordP[contador];
            contador--;
        }
        boolean isPalindroma = true;
        contador = wordP.length-1;
        for (int j = 0 ; j< wordP.length-1 ; j++){
            System.out.println(wordP[j]+" "+newWord[contador]);
            if (!wordP[j].equals("")){
                isPalindroma = false;
            }contador--;
        }
        return isPalindroma;
    }
}
