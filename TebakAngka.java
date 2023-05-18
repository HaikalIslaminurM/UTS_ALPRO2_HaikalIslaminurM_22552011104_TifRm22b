import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        int angkaRandom = (int) (Math.random() * 20) + 1;
        int tebakan;
        int jumlahTebakanSalah = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di permainan tebak angka!");
        System.out.println("Komputer telah memilih sebuah angka antara 1 sampai 20.");
        System.out.println("Silakan tebak angka tersebut.");

        do {
            System.out.print("Tebakan Anda: ");
            tebakan = input.nextInt();
            jumlahTebakanSalah++;

            if (tebakan < angkaRandom) {
                System.out.println("Tebakan Anda salah. Silakan coba lagi.");
            } else if (tebakan > angkaRandom) {
                System.out.println("Tebakan Anda terlalu besar. Silakan coba lagi.");
            } else {
                System.out.println("Selamat, tebakan Anda benar!");
            }
        } while (tebakan != angkaRandom && jumlahTebakanSalah < 20);

        double score = ((20 - jumlahTebakanSalah) / 20.0) * 100;

        System.out.println("Permainan selesai.");
        System.out.printf("Score Anda: %.2f%%\n", score);
    }
}