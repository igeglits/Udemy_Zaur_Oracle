package urok13;

class CaseTrenning {
    public static void main(String[] args) {
        int monthNumber = 4;
        switch (monthNumber) {
            case 1 -> System.out.println("31 день");
            case 2 -> System.out.println("30 days");
            case 3 -> System.out.println("31 days");
            default -> System.out.println("wrong month");
        }
    }
}
