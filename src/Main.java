class Main {
    public static void main(String[] args) {
        System.out.println(convertNumberToWords.convertToWords(120));
        System.out.println(convertNumberToWords.convertToWords(12_350));
        System.out.println(convertNumberToWords.convertToWords(12350));
        System.out.println(convertNumberToWords.convertToWords(487));
        System.out.println(convertNumberToWords.convertToWords(0));
        System.out.println(convertNumberToWords.convertToWords(5_220_487));
        System.out.println(convertNumberToWords.convertToWords(5220487));
        System.out.println(convertNumberToWords.convertToWords(20000001));
        System.out.println(convertNumberToWords.convertToWords(1000001));
//        System.out.println(convertNumberToWords.convertToWords(-1));   // Throws an exception
    }
}