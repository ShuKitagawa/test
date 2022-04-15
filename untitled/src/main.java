
class main {
	public static void main(String[] args) {
		boolean menuFlg = true;
		while(menuFlg) {
			try {
				//メインメニュー
				System.out.println("メニューを選んでください　1:燃費計算 2:車種管理 3:移動計算");
				int fn = new java.util.Scanner(System.in).nextInt();

				switch (fn) {
				case 1:
					//燃費計算
					System.out.println("燃費計算をします");
					carInfo.main();
					break;
				case 2:
					//ToDo 車種管理
					System.out.println("車種管理をします");
					carManagement.main();
					break;
				case 3:
					//移動計算
					System.out.println("移動計算をします");
					tripCalc.main();
					break;
				default:
					System.out.println("不正な値が入力されました");
				}


				System.out.println("初期メニューに戻りますか？ 1:Yes 2:No");
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
}

/* public static String Name(){
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