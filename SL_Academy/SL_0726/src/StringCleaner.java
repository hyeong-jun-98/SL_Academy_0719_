public class StringCleaner {
    public static String clean(String s) {
        s = s.replace("<b>","" );
        s = s.replace("&quot;","" );
        s = s.replace("</b>","" );

         return s;
//
    }
}
