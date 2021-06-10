public class Pattern {
    int column = 0;
    int number = 0;

    public boolean patternLength(int length) {
        if (length > 9 || length < 1) {
            System.out.println("Wrong number");
            return false;
        }
        return true;
    }

    public void returnPattern(int length) {
        if (patternLength(length)) {
            for (int i = 0; i <= length; i++) {
                for (int j = length - 1; j >= i; j--) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int k = 0; k <= column; k++) {
                    if (k == 0) {
                        number = 0;
                    } else if (k <= i) {
                        number++;
                    } else {
                        number--;
                    }
                    System.out.print(number);
                }
                column += 2;
                System.out.println("*");
            }
            System.out.println();
        }
    }
}