public class IndexOfLongestSubString {

    public static Integer findFirstOccurenceOfSubStr(String originalStr, String subStr) {
        for (int i = 0; i < originalStr.length(); i++) {
            boolean strPartMatches = true;
            for( int j = 0; j < subStr.length(); j++) {
                if( (i+j) > originalStr.length()) {
                    strPartMatches = false;
                    break;
                } else if( subStr.toLowerCase().charAt(j) != originalStr.toLowerCase().charAt(i + j)) {
                    strPartMatches = false;
                    break;
                }
            }
            if(strPartMatches) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(findFirstOccurenceOfSubStr("MYTEXTDONETOOGOOOO", "MY"));
    }
}
