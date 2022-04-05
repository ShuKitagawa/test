import java.util.Scanner;

public class carInfo {
    public static String Name(){
        System.out.println("車種を入力してください。");
        String carName = new java.util.Scanner(System.in).nextLine();
        return carName;
    }

    public static int Gas(){
        System.out.println("ガソリンを入れた量/Lを入力してください。");
        int carGas = new Scanner(System.in).nextInt();
        return carGas;
    }

    public static int Trip(){
        System.out.println("今回の走行距離(km)を入力してください");
        int carTrip = new Scanner(System.in).nextInt();
        return carTrip;
    }
}
