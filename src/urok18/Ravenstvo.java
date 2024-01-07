package urok18;

class Ravenstvo {
    static StringBuilder sb1 = new StringBuilder("abc");
    static StringBuilder sb2 = new StringBuilder("abc");
    static StringBuilder sb3 = sb1;
    static StringBuilder sb4 = new StringBuilder("123");



    static boolean stringBEquals(StringBuilder sb1, StringBuilder sb2) {
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(stringBEquals(sb1, sb4));
    }
}

