import java.util.Scanner;


class main {
    public static void main(String[] args){
        /*Car myCar = new Car();
        myCar.SetName("アコード");
        myCar.SetTank(55);
        myCar.SetGas(170);
        System.out.println(); */
        System.out.println("車種を入力してください。");
        String carName = new java.util.Scanner(System.in).nextLine();

        System.out.println("ガソリンを入れた量/Lを入力してください。");
        int carGas = new Scanner(System.in).nextInt();

        System.out.println("車種情報を入力しました。");
        System.out.println("燃費を計算します");

        System.out.println("今回の走行距離(km)を入力してください");
        int carTrip = new Scanner(System.in).nextInt();
        System.out.println( carName +"の今回走行の燃費は" + (carTrip/carGas) + "km/Lです。");

    }
}
/*
class Car {

    public void SetName(String name) {
            System.out.println("車種を入力してください。");
            String carName = new java.util.Scanner(System.in).nextLine();
            System.out.println("車種は" + name);

        }

    public void SetTank(int tank) {
        System.out.println("タンク容量を入力してください。");
        int carTank = new Scanner(System.in).nextInt();
        tank = carTank;
        System.out.println("タンク容量は" + tank + "L");

    }

    public void SetGas(int gas) {
        System.out.println("ガソリン単価/Lを入力してください。");
        int carGas = new Scanner(System.in).nextInt();
        System.out.println("ガソリン単価" + gas + "/L");

    }


}
*/
