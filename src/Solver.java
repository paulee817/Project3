package src;

public class Solver {
    Tray tray;

    public Solver (int tWidth, int tLength) {
        tray = new Tray(tWidth, tLength);
    }

    public static void main(String[] args) {
        check(args);
    }

        

    private static void check(String[] args) {
        int count = 0;
        if (args.length < 2) {
            throw new IllegalArgumentException("Not enough arguments");
        }
        for (int i = 0 ; i < args.length - 2 ; i ++) {
            if (!args[i].startsWith("-")) {
                throw new IllegalArgumentException("Option in wrong format");
            }
        }
    }
}
