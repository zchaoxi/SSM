package LOL.Utils;

public class PositionConvertUtil {

    public static String convert(String position){
        if (position.equalsIgnoreCase("1")){
            return "上单";
        }
        if (position.equalsIgnoreCase("2")){
            return "打野";
        }
        if (position.equalsIgnoreCase("3")){
            return "中单";
        }
        if (position.equalsIgnoreCase("4")){
            return "ad";
        }
        if (position.equalsIgnoreCase("5")){
            return "辅助";
        }
        return null;
    }
}
