package urok14;

class Timer {
    public static void main(String[] args) {
        timer(6);
    }

    static void timer(int hours) {
        OUTER:
        for (int i = 0; i <= hours; i++) {
            INNER_1:
            for (int j = 0; j <= 59; j++) {
                INNER_2:
                for (int s = 0; s <= 59; s++) {
                    if ((i > 1) && j != 0 && (j % 10 == 0)) {
                        break OUTER;
                    }
                    if ((s * i) > j) {
                        continue INNER_1;
                    }
                    System.out.println(i + " : " + j + " : " + s );
                }
            }
        }
    }
}

