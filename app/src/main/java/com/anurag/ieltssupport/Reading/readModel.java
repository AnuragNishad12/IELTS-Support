package com.anurag.ieltssupport.Reading;

public class readModel {
    String title,eassy;


    public readModel() {
    }

    public readModel(String title, String eassy, String image) {
        this.title = title;
        this.eassy = eassy;

    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title.replace("_b","\n");
    }

    public String getEassy() {
        return eassy;
    }

    public void setEassy(String eassy) {
        this.eassy = eassy.replace("_b","\n");
    }
}
