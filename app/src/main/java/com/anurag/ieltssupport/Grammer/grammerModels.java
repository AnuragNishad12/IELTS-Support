package com.anurag.ieltssupport.Grammer;

public class grammerModels {

    int image;
    String topic;
    String video;

    public grammerModels(int image, String topic, String video) {
        this.image = image;
        this.topic = topic;
        this.video = video;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
