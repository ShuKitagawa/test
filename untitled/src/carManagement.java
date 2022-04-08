import java.util.Scanner;

public class carManagement {
    public static void main() {
    	System.out.println("登録する車種を入力してください。");
    	String newCar = new Scanner(System.in).nextLine();
    	dbCon.sqlexcute(newCar);
    	System.out.println(newCar + "を登録しました");
    }
    

}
