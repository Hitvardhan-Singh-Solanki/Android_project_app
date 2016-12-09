package com.hitvardhan.project_app;

/**
 * Created by Hitvardhan on 08-12-2016.
 */

import java.util.List;

public class Response {

    private List<Record> records = null;

    /**
     *
     * @return
     * The records
     */
    public List<Record> getRecords() {
        return records;
    }

    /**
     *
     * @param records
     * The records
     */
    public void setRecords(List<Record> records) {
        this.records = records;
    }

}
