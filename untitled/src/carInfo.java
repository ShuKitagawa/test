import java.util.Scanner;

public class carInfo {
    public static void main() {
        System.out.println(Name() + "の今回走行の燃費は" + (Trip() / Gas()) + "km/Lです。");
    }

    //車種入力
    public static String Name(){
        System.out.println("車種を入力してください。");
        return new Scanner(System.in).nextLine();
    }

    //給油量入力
    public static int Gas(){
        System.out.println("ガソリンを入れた量/Lを入力してください。");
        return new Scanner(System.in).nextInt();
    }

    //走行距離入力
    public static int Trip(){
        System.out.println("今回の走行距離(km)を入力してください");
        return new Scanner(System.in).nextInt();
    }
}
