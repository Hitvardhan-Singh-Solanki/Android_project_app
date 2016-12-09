package com.hitvardhan.project_app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Hitvardhan on 08-12-2016.
 */

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> Tasks = new ArrayList<String>();
        Tasks.add("Task 1");
        Tasks.add("Task 2");
        Tasks.add("Task 3");
        Tasks.add("Task 4");
        Tasks.add("Task 5");

        List<String> Pending = new ArrayList<String>();
        Pending.add("Pending Task 1");
        Pending.add("Pending Task 2");
        Pending.add("Pending Task 3");
        Pending.add("Pending Task 4");
        Pending.add("Pending Task 5");


        expandableListDetail.put("Pending Tasks", Pending);
        expandableListDetail.put("Todays Tasks", Tasks);

        return expandableListDetail;
    }
}
