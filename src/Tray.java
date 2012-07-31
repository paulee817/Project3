package src;

public class Tray {

	public boolean [][] isUsed;
    public Block [][] blocks;
	
	public Tray(int rows, int cols) {
		isUsed = new boolean [cols][rows];
        blocks = new Block[cols][rows];
	}


/* This proves that boolean[][] is default to false
    public static void main(String[] args) {
        Tray test = new Tray(5, 5);
        for (boolean[] b : test.isUsed) {
            for (boolean bb : b) {
                System.out.println(bb);
            }
        }
    }*/
}
