package demo;



import org.apache.commons.lang3.StringUtils;

import java.util.logging.Logger;

/**
 * @BelongsProject: sanjin-backend-init
 * @BelongsPackage: demo
 * @Author: San Jin
 * @CreateTime: 2024-06-29 20:02
 * @Version: 1.0
 */
public class test1 {
    private static Logger log = Logger.getLogger(test1.class.getName());

    public static void main(String[] args) {
        //StringUtils中 isNotEmpty 和isNotBlank的区别
        test1();
    }

    public static void test1 (){
        String s = "abc";
        String s1 = " abc";
        String s4 = "  ";
        System.out.println(StringUtils.isNoneBlank(s,s1,s4));



    }

}
