import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class OrdemAlfabetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> nomeM = new ArrayList();
        List<String> nomeF = new ArrayList();
        List<String> nomeI = new ArrayList();


        //Carol -f, Bernardo -m, Andre -m, David -m, Elena -f
        System.out.println("Quais os nomes?(nome -m/f,) ");

        String nome = sc.nextLine();
        String[] nomeList = nome.split(",\\s");
        for (int i = 0; i < nomeList.length; i++) {
            nomeI.add(nomeList[i]);
        }

        for (int i = 0; i < nomeI.size(); i++) {
            String temp = nomeI.get(i).toString();
            String[] temp2 = temp.split("-");

            if (temp2.length >= 2) {
                if (temp2[1].equals("m")) {
                    nomeM.add(temp2[0]);
                } else if (temp2[1].equals("f")) {
                    nomeF.add(temp2[0]);
                }
            }
        }

        Collections.sort(nomeF);
        Collections.sort(nomeI);
        Collections.sort(nomeM);
        System.out.println("Lista original: " + nomeI);
        System.out.println("Nomes femininos: " + nomeF);
        System.out.println("Nomes masculinos: " + nomeM);

        sc.close();
    }
}