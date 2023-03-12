package com.anurag.ieltssupport.Speaking;

public class part1SpeaModel {

    String topic,ques,ans;

    public part1SpeaModel() {
    }

    public part1SpeaModel(String topic, String ques, String ans) {
        this.topic = topic;
        this.ques = ques;
        this.ans = ans;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic.replace("_b","\n");
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques.replace("_b","\n");
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans.replace("_b","\n");
    }
}
