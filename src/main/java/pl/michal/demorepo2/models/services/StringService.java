package pl.michal.demorepo2.models.services;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StringService {

    public String genereteRandomString(){
        return UUID.randomUUID().toString();
    }
}
