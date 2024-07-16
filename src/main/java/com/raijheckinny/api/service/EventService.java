package com.raijheckinny.api.service;

import com.raijheckinny.api.domin.event.Event;
import com.raijheckinny.api.domin.event.EventRequestDTO;
import org.springframework.web.multipart.MultipartFile;

public class EventService {
    public Event createEvent(EventRequestDTO data){
        String imgUrl = null;

        if(data.image() != null){
           imgUrl =  this.uploadImg(data.image());
        }

        Event newEvent = new Event();

        return newEvent;
    }

    private String uploadImg(MultipartFile multipartFile){
        return "";
    }
}
