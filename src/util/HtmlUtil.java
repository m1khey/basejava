package util;

import model.Organization;

public class HtmlUtil {
    public static boolean isEmpty(String str) {
        return str==null || str.trim().length()==0;
    }

    public static String formateDates(Organization.Position position) {
        return DateUtil.format(position.getStartDate())+" - "+DateUtil.format(position.getEndDate());
    }
}
