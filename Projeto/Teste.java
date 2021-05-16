package projeto;

import java.util.*;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Jogador gr = new GuardaRedes();
        Jogador def = new Defesa();
        Jogador med = new Medio();
        Jogador la = new Lateral();
        Jogador av = new Avancado();

        System.out.print("Introduza o método que quer testar: ");
        int caso = ler.nextInt();
        System.out.print("\n");
        // teste

        switch(caso) {
            case 0: {
                System.out.println(gr.toString());
                System.out.println(def.toString());
                System.out.println(la.toString());
                System.out.println(med.toString());
                System.out.println(av.toString());
                break;
            }
            case 1: {
                System.out.println(gr.calculaOverall());
                System.out.println(def.calculaOverall());
                System.out.println(la.calculaOverall());
                System.out.println(med.calculaOverall());
                System.out.println(av.calculaOverall());
                break;
            }
            case 2: {
                try {
                    Map<String, Equipa> equipas = new HashMap<>();
                    List<Jogo> jogos = new ArrayList<>();
                    Parser.parse(equipas, jogos);
                    for (String e: equipas.keySet()){
                        System.out.println(e);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
            case 3: {
                break;
            }
            default: {
                System.out.println("Método não existe.");
                break;
            }
        }
        ler.close();
    }
}
