/*Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà
 cilindrata, targa, marca e modello. Per questa classe saranno necessari i metodi accessori
 (getters e setters) ed un costruttore. Nel main dichiarare un oggetto di tipo Auto.
In questo caso la nota importante è rendere le proprietà della classe auto accessibili solo attraverso i metodi.*/
public class Main {
    public static void main(String[] args) {
        Auto alfa = new Auto ("1300", "FN 123 FC", "Mito", "AlfaRomeo");
        System.out.println(alfa); //test
        System.out.println(alfa.getMarca()); //test
        System.out.print(alfa.getTarga()); //test
    }
}