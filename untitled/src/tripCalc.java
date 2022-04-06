import java.util.Scanner;

public class tripCalc {
    public static void main() {
        int total = totalGas();
        int cost = totalCost(total);
        System.out.println("今回は"+ total + "Lのガソリンが必要です。そのためガソリン代はおおよそ" + cost + "円掛かかります");
    }

    //必要なガソリン量計算
    private static int totalGas() {
        System.out.println("目的地までの距離（km）を入力してください。");
        int km = new Scanner(System.in).nextInt();
        System.out.println("車の平均燃費（km/L）を入力してください");
        int gasMileage = new Scanner(System.in).nextInt();

        return km/gasMileage;
    }

    //目的地に行くまで必要なガソリン代計算
    private static int totalCost(int total) {
        System.out.println("ガソリン価格（円/L）を入力して下さい");
        int gasCost = new Scanner(System.in).nextInt();

        return gasCost * total;
    }

}
