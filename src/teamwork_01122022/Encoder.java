package teamwork_01122022;

public class Encoder {
    public static void main(String[] args) {
        System.out.println(encode("Ali"));
        System.out.println(decode("Eba"));

    }
    static String encode(String str) {
        StringBuilder encodeString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int num = chars.indexOf(c);
            encodeString.append(crypt.charAt(num));
        }
        return encodeString.toString();
    }

    static String decode(String str) {
        StringBuilder decodeString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int num = crypt.indexOf(c);
            decodeString.append(chars.charAt(num));
        }
        return decodeString.toString();
    }

    static String chars = "AEIİOÖUÜBCÇDFGĞHJKLMNPRSŞTVWXYZQaeıioöuübcçdfgğhjklmnprsştvyzqw.,!?%& ";
    static String crypt = "EİAÜIOUÖPCBFĞHZJKŞLDMYNWGRSTVXÇQıöeaiuüoczdfgqhtjkblynpmçsrşğvw.,!?%& ";
}

