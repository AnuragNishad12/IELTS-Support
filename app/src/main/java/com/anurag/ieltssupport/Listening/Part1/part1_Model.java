package com.anurag.ieltssupport.Listening.Part1;

public class part1_Model {

    int topic;
    int image;
    String video;

    public part1_Model(int topic, int image, String video) {
        this.topic = topic;
        this.image = image;
        this.video = video;
    }

    public int getTopic() {
        return topic;
    }

    public void setTopic(int topic) {
        this.topic = topic;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
