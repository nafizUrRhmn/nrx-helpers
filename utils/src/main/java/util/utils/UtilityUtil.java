package util.utils;

public class UtilityUtil {

    public static Boolean isBitValueExist(int total, int bitValue){
        return (total & bitValue)!=0;
    }
}
