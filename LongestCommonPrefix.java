import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Project: Leetcode
 * @Author: Unknown
 * @Create: 2020--05--13--12:14 PM
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String strs[]){
        String preFix = strs[0];

        if(strs.length == 0)
            return "";
        for(int i = 0; i < strs.length; i++){
            while (strs[i].indexOf(preFix) != 0){
                preFix = preFix.substring(0, preFix.length() - 1);
                if (preFix.length() == 0)
                    return "";
            }
        }
        return preFix;
    }
}
