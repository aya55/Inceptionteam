package com.inceptionteam.Menu;

import com.inceptionteam.R;

import java.util.ArrayList;
import java.util.List;

public class MenuUtil {

    public static final int HOME_FRAGMENT_CODE = 0;
    public static final int Android_FRAGMENT_CODE = 1;
    public static final int HR_FRAGMENT_CODE = 2;
    public static final int PR_FRAGMENT_CODE = 3;
    //public static final int PROGRAMMING_FRAGMENT_CODE = 4;
    //public static final int WEB_FRAGMENT_CODE = 5;


    public static List<MenuItem> getMenuList() {

        List<MenuItem> list = new ArrayList<>();
        // first menu item is selected
        list.add(new MenuItem(R.drawable.ic_home,HOME_FRAGMENT_CODE,true));
        list.add(new MenuItem(R.drawable.ic_android,Android_FRAGMENT_CODE,false));
        list.add(new MenuItem(R.drawable.ic_hr,HR_FRAGMENT_CODE,false));
        list.add(new MenuItem(R.drawable.ic_pr,PR_FRAGMENT_CODE,false));

        return list;



    }



}
