package com.phaete.nf402spring;

import java.util.Objects;

public class Message {
    // Variables
    private String id;
    private String name;
    private String message;

    // Constructor
    public Message(String id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
    }

    public Message() {
    }

    // Methods



    // Boilerplate
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message1 = (Message) o;
        return Objects.equals(id, message1.id) && Objects.equals(name, message1.name) && Objects.equals(message, message1.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, message);
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
