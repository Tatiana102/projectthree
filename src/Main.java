public class Main {
    public static void main(String[] args) {
        int check =100;
        int pay = 1400;
        int bon = 0;
        int fin;


        if (pay > 1000) {
            bon = (pay / 100) * 1;
            fin = bon + pay+ check;
        }
        System.out.println(bon+pay+check);
    }
}