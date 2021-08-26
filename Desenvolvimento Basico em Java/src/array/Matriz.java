package array;

public class Matriz {
	public static void main(String[]args) {
		int[][] meuArrayMulti = {{1,2,3,4}, {53,63,73}};
		
		//percorrendo matriz
		
		for(int i =0; i< meuArrayMulti.length; i++) {
			for(int j = 0; j<meuArrayMulti[i].length;j++) {
				System.out.println(meuArrayMulti[i][j]);
			}
		}
	}

}
