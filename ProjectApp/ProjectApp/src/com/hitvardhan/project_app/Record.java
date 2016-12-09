package com.hitvardhan.project_app;

/**
 * Created by Hitvardhan on 08-12-2016.
 */

public class Record {


    private Attributes attributes;
    private String name;
    private String dueDateC;
    private String descriptionC;

    /**
     *
     * @return
     * The attributes
     */
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     *
     * @param attributes
     * The attributes
     */
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The dueDateC
     */
    public String getDueDateC() {
        return dueDateC;
    }

    /**
     *
     * @param dueDateC
     * The Due_Date__c
     */
    public void setDueDateC(String dueDateC) {
        this.dueDateC = dueDateC;
    }

    /**
     *
     * @return
     * The descriptionC
     */
    public String getDescriptionC() {
        return descriptionC;
    }

    /**
     *
     * @param descriptionC
     * The Description__c
     */
    public void setDescriptionC(String descriptionC) {
        this.descriptionC = descriptionC;
    }

}
