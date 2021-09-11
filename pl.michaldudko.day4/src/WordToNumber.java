// dzien 4 rozwiazanie cwiczenia 2
class WordToNumber {
    public static void main(String[] arguments) {
        if (arguments.length > 0) {
            long num = 0;
            char firstchar = arguments[0].charAt(0);
            char secondchar = arguments[0].charAt(1);
            switch (firstchar) {
                case 'o':
                    num = 1L;
                    break;

                case 't':
                    if (secondchar == 'e')
                        num = 10L;
                    if (secondchar == 'h')
                        num = 3L;
                    if (secondchar == 'w')
                        num = 2L;
                    break;

                case 'f':
                    if (secondchar == 'o')
                        num = 4L;
                    if (secondchar == 'i')
                        num = 5L;

                    break;


                case 's':
                    if (secondchar == 'i')
                        num = 6L;
                    if (secondchar == 'e')
                        num = 7L;
                    break;

                case 'e':
                    if (secondchar== 'i')
                    num = 8L;
                    break;

                case 'n':
                    num = 9L;
            }
            System.out.println("The number is " + num);
        }

    }
}

// xone xtwo xthree xfour xfive xsix xseven eight nine xten