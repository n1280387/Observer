class jyuurokushinHyouji implements Observer {
	public void update(Subject) {
		print(((Suuchi)s).getValue());
	}

	private void print(int n) {
		System.out.println(n + "を16進数で表示します");
		//
		//ここに16進数表示処理を作成する
		//
	}
}
