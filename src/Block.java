package src;

public class Block {
	private int length;
	private int width;
	
    public Block (int width, int length) {
		if (length < 0 || width < 0) {
			throw new IllegalArgumentException("Length and width must be greater than 0");
		}
        this.width = width;
        this.length = length;
    }
}
