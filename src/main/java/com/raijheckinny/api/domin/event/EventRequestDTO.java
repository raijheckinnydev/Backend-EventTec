package com.raijheckinny.api.domin.event;

import org.springframework.web.multipart.MultipartFile;

public record EventRequestDTO(String title, String description, Long date, String city, String state, Boolean remote, String eventeUrl, MultipartFile image){
}
