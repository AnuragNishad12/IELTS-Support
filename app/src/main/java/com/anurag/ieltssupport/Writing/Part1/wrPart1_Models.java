package com.anurag.ieltssupport.Writing.Part1;

public class wrPart1_Models {

    String ans,ques,topic;


    public wrPart1_Models() {
    }

    public wrPart1_Models(String ans, String ques, String topic) {
        this.ans = ans;
        this.ques = ques;
        this.topic = topic;
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
}
