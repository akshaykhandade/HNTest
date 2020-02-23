package com.retrofitdemo.com.hntest;

import java.util.List;

public class Items {


    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("response")
    private List<Response> response;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("message")
    private String message;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("message_code")
    private int message_code;



    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getMessage_code() {
        return message_code;
    }

    public void setMessage_code(int message_code) {
        this.message_code = message_code;
    }

    public static class Response {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("color")
        private String color;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("user_id")
        private String user_id;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("long1")
        private String long1;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("lat")
        private String lat;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("description")
        private String description;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("event_flyer")
        private String event_flyer;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("address")
        private String address;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("event_venue")
        private String event_venue;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("to_age")
        private String to_age;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("from_age")
        private String from_age;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("end_time")
        private String end_time;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("end_date")
        private String end_date;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("start_time")
        private String start_time;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("start_date")
        private String start_date;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("event_name")
        private String event_name;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("post_event_id")
        private String post_event_id;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getLong1() {
            return long1;
        }

        public void setLong1(String long1) {
            this.long1 = long1;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getEvent_flyer() {
            return event_flyer;
        }

        public void setEvent_flyer(String event_flyer) {
            this.event_flyer = event_flyer;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEvent_venue() {
            return event_venue;
        }

        public void setEvent_venue(String event_venue) {
            this.event_venue = event_venue;
        }

        public String getTo_age() {
            return to_age;
        }

        public void setTo_age(String to_age) {
            this.to_age = to_age;
        }

        public String getFrom_age() {
            return from_age;
        }

        public void setFrom_age(String from_age) {
            this.from_age = from_age;
        }

        public String getEnd_time() {
            return end_time;
        }

        public void setEnd_time(String end_time) {
            this.end_time = end_time;
        }

        public String getEnd_date() {
            return end_date;
        }

        public void setEnd_date(String end_date) {
            this.end_date = end_date;
        }

        public String getStart_time() {
            return start_time;
        }

        public void setStart_time(String start_time) {
            this.start_time = start_time;
        }

        public String getStart_date() {
            return start_date;
        }

        public void setStart_date(String start_date) {
            this.start_date = start_date;
        }

        public String getEvent_name() {
            return event_name;
        }

        public void setEvent_name(String event_name) {
            this.event_name = event_name;
        }

        public String getPost_event_id() {
            return post_event_id;
        }

        public void setPost_event_id(String post_event_id) {
            this.post_event_id = post_event_id;
        }
    }
}
