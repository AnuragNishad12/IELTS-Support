package com.anurag.ieltssupport.Vocabulary;

public class Model_Vacabulary {

    String words, topic;

    public Model_Vacabulary() {
    }

    public Model_Vacabulary(String words, String topic) {
        this.words = words;
        this.topic = topic;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words.replace("_b","\n");
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic.replace("_b","\n");
    }
}
