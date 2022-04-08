import java.util.Scanner;

public class carManagement {
	public static void main() {
		boolean menuFlg = true;
		while(menuFlg) {
			System.out.println("機能を選んでください  1:車種登録 2:車種参照 3:車種削除" );
			int fn = new java.util.Scanner(System.in).nextInt();

			try {
				switch (fn) {
				case 1:
					//車種登録
					System.out.println("車を登録します");
					carRegist();
					break;

				case 2:
					//ToDo 車種参照
					System.out.println("登録した車を確認します");
					break;

				case 3:
					// ToDo 車種削除
					System.out.println("登録した車を削除します");
					break;

				default:
					System.out.println("不正な値が入力されました");
				}


				System.out.println("車種管理メニューに戻りますか？ 1:Yes 2:No");
				int mn = new java.util.Scanner(System.in).nextInt();

				//終了処理
				if(mn == 2){
					System.out.println("終了します");
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
				dbCon.sqlexcute(newCar);
				System.out.println(newCar + "を登録しました");
				break;
			} else {
				System.out.println("空白で登録することはできません。");
			}
		}
	}
}
