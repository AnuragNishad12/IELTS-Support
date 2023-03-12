package com.anurag.ieltssupport.Writing.Part2;

public class wPart2Model {

    String ans,ques,topic,image;


    public wPart2Model() {
    }

    public wPart2Model(String ans, String ques, String topic, String image) {
        this.ans = ans;
        this.ques = ques;
        this.topic = topic;
        this.image = image;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans.replace("_b","\n");
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques.replace("_b","\n");
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
