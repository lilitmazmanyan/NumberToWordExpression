public class convertNumberToWords {
    private static final String[] TASNORDAKAN = {"", " տասը", " քսան", " երեսուն", " քառասուն", " հիթսուն",
            " վաթսուն", " յոթանասուն", " ութսուն", " իննսուն"};

    private static final String[] TVANSHANNER = {"", " մեկ", " երկու", " երեք", " չորս", " հինգ", " վեց", " յոթ",
            " ութ", " ինը", " տասը"};

    private static final String[] OTHERS = {"", " հազար", " միլիոն", " բիլիոն", " տրիլիոն"};

    /**
     * Converts numbers less than 1000
     *
     * @param number to convert
     * @return respective word combination for the parameter
     */
    private static String convertLessThanThousand(int number) {
        String result;

        if (number % 100 <= 10) {
            result = TVANSHANNER[number % 10];
            number /= 100;
        } else if (number % 100 < 20) {
            result = " տասն" + TVANSHANNER[number % 10];
            number /= 100;
        } else {
            result = TVANSHANNER[number % 10];
            number /= 10;

            result = TASNORDAKAN[number % 10] + result;
            number /= 10;
        }
        if (number == 0) return result;
        return TVANSHANNER[number] + " հարյուր" + result;
    }

    /**
     * @param number to convert
     * @return espective word combination for the parameter
     */
    public static String convertToWords(int number) {
        if (number < 0) {
            throw new IllegalStateException("Amount cannot be null");
        }

        if (number == 0) {
            return "Զրո";
        }

        String prefix = "";

        String result = "";
        int place = 0;

        while (number > 0) {
            int n = number % 1000;
            if (n != 0) {
                String s = convertLessThanThousand(n);
                result = s + OTHERS[place] + result;
            }
            place++;
            number /= 1000;
        }
        return (prefix + result).trim();
    }

   
}


