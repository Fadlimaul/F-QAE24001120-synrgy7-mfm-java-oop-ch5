import java.util.Scanner;

public class AplikasiParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int waktuparkir = input.nextInt();

        if (waktuparkir <= 5) {
            System.out.println(1);
        } else if (waktuparkir >= 6 && waktuparkir < 24) {
            System.out.println(1+((waktuparkir-5)*0.5));
        } else if (waktuparkir == 24) {
            System.out.println(15);
        } else if(waktuparkir > 24) {
            System.out.println(15+((waktuparkir-24)*0.5));
        } else {
            //System.out.println("eror");
        }
    }
}
