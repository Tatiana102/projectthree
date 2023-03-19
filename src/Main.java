public class Main {
    public static void main(String[] args) {
        int check = 100;
        int replenishment = 1200;
        int bonusForRep = 0;
        int total;


        if (replenishment > 1000) {
            bonusForRep = (replenishment / 100) * 1;
            total = bonusForRep + replenishment + check;
        }
        System.out.println("Бонусов начислено:");
        System.out.println(bonusForRep);
        System.out.println("Сумма на счете:");
        System.out.println(bonusForRep + replenishment + check);

    }
}