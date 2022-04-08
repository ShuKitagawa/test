import java.util.Objects;
import java.util.Scanner;

public class carManagement {
	public static void main() {
		boolean menuFlg = true;
		while(menuFlg) {
			System.out.println("機能を選んでください  1:車種登録 2:燃費登録 3:車種一覧参照" );
			int fn = new java.util.Scanner(System.in).nextInt();

			try {
				switch (fn) {
				case 1:
					//車種登録
					System.out.println("車を登録します");
					carRegist();
					break;

				case 2:
					System.out.println("登録した車種の燃費を登録します");
					dbCon.sqlSelect();
					carFuel() ;
					break;

				case 3:
					//車種参照
					System.out.println("登録した車を確認します");
					dbCon.sqlSelect();
					break;


				default:
					System.out.println("不正な値が入力されました");
				}


				System.out.println("車種管理メニューに戻りますか？ 1:Yes 2:No");
				int mn = new java.util.Scanner(System.in).nextInt();

				//終了処理
				if(mn == 2){
					System.out.println("車種管理を終了します");
					menuFlg = false;
				}
			}catch (Exception e) {
				System.out.println("不正な値が入力されました");
			}
		}

	}

	public static void carRegist() {
		Boolean scanFlg = true;
		while(scanFlg) {
			System.out.println("登録する車種を入力してください。");
			String newCar = new Scanner(System.in).nextLine();
			if(newCar!= "") {
				dbCon.sqlInsert(newCar);
				System.out.println(newCar + "を登録しました");
				break;
			} else {
				System.out.println("空白で登録することはできません。");
			}
		}
	}
	public static void carFuel() {
		Boolean scanFlg = true;
		while(scanFlg) {
			System.out.println("燃費を登録する車のIDを入力してください。");
			int CarId = new Scanner(System.in).nextInt();
			//nullチェック
			if(Objects.isNull(CarId)) {
				System.out.println("空白で登録することはできません。");
			} else {
				String name =dbCon.sqlFuelSelect(CarId);
				System.out.println("燃費(km/L)を入力してください。");
				int fuelQuality = new Scanner(System.in).nextInt();
				dbCon.sqlFuelInsert(CarId,fuelQuality);
				System.out.println(name + "に燃費を登録しました");
				scanFlg = false;
			}
		}
	}
}
