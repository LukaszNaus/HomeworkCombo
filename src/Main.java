import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] imiona=new String[]{"Agata", "Ania", "Marta", "Sylwia", "Lukasz"};


        System.out.println("Podaj imie");
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.nextLine();
        System.out.println("podaj nazwisko");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj wiek");



        int x = scanner.nextInt();
        if (x>18){
            System.out.println(imie  + nazwisko +" Mozesz wejsc");
        }else {
            System.out.println(imie + nazwisko + " Nie Mozesz wejsc");
        }

            if (x>=18&25>=x) {
                System.out.println("dostajesz darmowe piwo");
            }else System.out.println("nie dostajesz darmowego piwa");
            for (String person:imiona)
                if(imie.equals(person)){
                System.out.println("Happy hours i darmowy shot");}
            if (x>=30&40>=x){
                System.out.println();
            }




    }


}
