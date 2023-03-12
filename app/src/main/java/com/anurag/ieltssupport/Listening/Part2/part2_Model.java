package com.anurag.ieltssupport.Listening.Part2;

public class part2_Model {

    String topic,audio,transcripts;

    public part2_Model() {
    }

    public part2_Model(String topic, String audio, String transcripts) {
        this.topic = topic;
        this.audio = audio;
        this.transcripts = transcripts;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic.replace("_b","\n");
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getTranscripts() {
        return transcripts;
    }

    public void setTranscripts(String transcripts) {
        this.transcripts = transcripts.replace("_b","\n");
    }
}
