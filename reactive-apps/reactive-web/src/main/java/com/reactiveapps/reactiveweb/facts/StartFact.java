package com.reactiveapps.reactiveweb.facts;

public class StartFact implements ContinuousFact {
    public final String uid;
    public final String data;

    public StartFact(String uid, String data) {
        this.uid = uid;
        this.data = data;
    }

    public String toString() {
        return "uid: " + uid +
                ", data: " + data;
    }
}
