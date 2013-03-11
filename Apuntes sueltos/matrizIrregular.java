class matrizIrregular {
	public static void main(String[] args) {
		int matriz[][] = new int[5][];
		for(int i = 0; i < 5; i++) {
			matriz[i] = new int[i+1];
			for(int j = 0; j <= i; j++) {
				matriz[i][j] = j + 1;
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}