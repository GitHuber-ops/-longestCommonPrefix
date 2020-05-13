/**
 * @Project: Leetcode
 * @Author: Unknown
 * @Create: 2020--05--13--4:14 PM
 */
public class LongestCommonPrefix01 {
    public String longestCommonPrefix(String strs[]) {
        if (strs.length == 0)
            return "";

        String preFix = strs[0];

        for (int i = 0; i <= strs[0].length(); i++) {
            for (String str : strs) {
                if (str.indexOf(preFix.substring(0, i)) != 0) {
                    preFix = preFix.substring(0, i - 1);
                    return preFix;
                }
            }
        }
        return preFix;
    }

    public static void main(String[] args) {
        System.out.println("b".indexOf("a".substring(0, 1)));
        System.out.println(new LongestCommonPrefix01().longestCommonPrefix(new String[]{"a", "b"}));
    }
}
