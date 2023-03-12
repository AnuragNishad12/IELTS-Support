package com.anurag.ieltssupport.Speaking.Part2;

public class part2Models {
    String topic,ques,ans;

    public part2Models() {
    }

    public part2Models(String topic, String ques, String ans) {
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
