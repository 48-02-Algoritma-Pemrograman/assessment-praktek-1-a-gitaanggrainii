import java.util.Scanner;

public class Nomor1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);{
            System.out.print("Total Jam Lembur =");
            int jamLembur = scanner.nextInt();

            double honorLembur;

            if (jamLembur <= 16) {
                honorLembur = jamLembur * 10000;
            } else {
                int jamLemburLebih = jamLembur - 16;
                honorLembur = (16 * 10000) + (jamLemburLebih * 15000);
            }

            System.out.println("Honor lembur: " + honorLembur);

        }
    }
}
