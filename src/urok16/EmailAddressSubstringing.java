package urok16;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EmailAddressSubstringing {
    public static void main(String[] args) {
        extractEmailDomain(emails);
    }

    public static String emails = "ya123@yahoo.com; on456@mail.ru; ona@gmail.com";

    static void extractEmailDomain(String emails) {
        int[] indexes = new int[6];
        indexes[5]=emails.length();
        for (int i = 0, j = 0; i < emails.length(); i++) {
            if ('@'==(emails.charAt(i))) {
                indexes[j] = i+1;
                j++;
            }
            if (';'==(emails.charAt(i))) {
                indexes[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(indexes));
        String[] domains = {emails.substring(indexes[0], indexes[1]), emails.substring(indexes[2], indexes[3]), emails.substring(indexes[4], indexes[5])};
        System.out.println(Arrays.toString(domains));

        String firstDomain = emails.substring(indexes[0], indexes[1]);
        String secondDomain = emails.substring(indexes[2], indexes[3]);
        String thirdDomain = emails.substring(indexes[4], indexes[5]);
        System.out.println(firstDomain + '\n'
                + secondDomain + '\n'
                + thirdDomain);
    }
}

