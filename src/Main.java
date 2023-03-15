public class Main {
    public static void main(String[] args) {
        int check = 100;
        int replenishment = 1200;
        int bonus_for_rep = 0;
        int total;


        if (replenishment > 1000) {
            bonus_for_rep = (replenishment / 100) * 1;
            total = bonus_for_rep + replenishment + check;
        }
        System.out.println("Бонусов начислено:");
        System.out.println(bonus_for_rep);
        System.out.println("Сумма на счете:");
        System.out.println(bonus_for_rep + replenishment + check);

    }
}