package Gun008;

public class StringReplaceAll {
    public static void main(String[] args) {

        // RplaceAll --> replace gibi calisir  farki kriterlere gore degistiri

        String  text  = " Merhaba Dünya";
        System.out.println(" orjinal hali = " + text);
        System.out.println("a,b,n leri _ yapilmis hali = " + text.replaceAll("[abn]", "_"));

                                                                        // [] parantez: sadece bu harfleri al demek

        System.out.println("Buyuk harfleri leri _ yapilmis hali = " + text.replaceAll("[A-Z]", "_"));
        System.out.println("kücük harfleri leri * yapilmis hali = " + text.replaceAll("[a-z]", "*"));















    }
}
