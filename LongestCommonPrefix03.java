import java.sql.PseudoColumnUsage;

/**
 * @Project: Leetcode
 * @Author: Unknown
 * @Create: 2020--05--13--5:32 PM
 */
public class LongestCommonPrefix03 {
    static String preFix;

    public String longestCommonPrefix(String strs[]) {
        if (strs.length == 0)
            return "";

        preFix = strs[0];

        for (String str : strs) {
            if (preFix.length() > str.length())
                preFix = str;
        }

        return halfLongestCommonPrefix(strs, preFix);
    }

    public String halfLongestCommonPrefix(String strs[], String localPreFix) {
        String OriPre = localPreFix;

        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(localPreFix) != 0) {
                localPreFix = localPreFix.substring(0, localPreFix.length() - 1);
                if (localPreFix.length() == 0)
                    return "";
            }
        }

        if (localPreFix == OriPre && OriPre.length() != 0) {
            localPreFix = localPreFix + halfLongestCommonPrefix(strs, preFix.substring(localPreFix.length(), preFix.length()));
        }

        return localPreFix;
    }

    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix01().longestCommonPrefix(new String[]{""}));
    }


}
