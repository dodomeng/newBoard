package com.example.ptboard;

public class User {
    String writer;
    String store;
    String pt_number;
    String pt_name;

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getPt_number() {
        return pt_number;
    }

    public void setPt_number(String pt_number) {
        this.pt_number = pt_number;
    }

    public String getPt_name() {
        return pt_name;
    }

    public void setPt_name(String pt_name) {
        this.pt_name = pt_name;
    }

    public User(String writer, String store, String pt_number, String pt_name) {
        this.writer = writer;
        this.store = store;
        this.pt_number = pt_number;
        this.pt_name = pt_name;
    }
}
