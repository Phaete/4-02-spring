package com.phaete.nf402spring;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private static List<Message> messageList = new ArrayList<>();

    @PostMapping
    public Message addMessage(@RequestBody Message message) {
        messageList.add(message);
        return message;
    }

    @GetMapping()
    public List<Message> getMessages() {
        return messageList;
    }

    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable String id) {
        for (Message message : messageList) {
            if (message.getId().equals(id)) {
                messageList.remove(message);
                break;
            }
        }
    }
}
