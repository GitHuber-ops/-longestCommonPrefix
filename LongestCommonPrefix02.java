import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @Project: Leetcode
 * @Author: Unknown
 * @Create: 2020--05--13--5:03 PM
 */
public class LongestCommonPrefix02 {
    public String longestCommonPrefix(String strs[]) {
        if (strs.length == 0)
            return "";

        String preFix = strs[0];

        if (strs.length == 1)
            return strs[0];

        if (strs.length == 2){
            while (strs[1].indexOf(preFix) != 0){
                preFix = preFix.substring(0, preFix.length() - 1);
                if (preFix.length() == 0)
                    return "";
            }
            return preFix;
        }

        String leftlongestCommonPrefix, rightlongestCommonPrefix;
        leftlongestCommonPrefix = longestCommonPrefix(Arrays.copyOfRange(strs, 0, strs.length / 2));
        rightlongestCommonPrefix = longestCommonPrefix(Arrays.copyOfRange(strs, strs.length / 2, strs.length));
        return longestCommonPrefix(new String[]{leftlongestCommonPrefix, rightlongestCommonPrefix});
    }


    public static void main(String[] args) {
        String [] results =new String[]{"1","2","3","1","2","3","1","2","3"};
        results = Arrays.copyOfRange(results, 0, 5);
        for (String result : results) {
            System.out.println(result);
        }


        System.out.println(new LongestCommonPrefix02().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}
