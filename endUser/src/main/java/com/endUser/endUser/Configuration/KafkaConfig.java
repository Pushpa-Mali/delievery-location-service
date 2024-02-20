package com.endUser.endUser.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import com.endUser.endUser.AppConstants.constants;

@Configuration
public class KafkaConfig {



    @KafkaListener(topics=constants.LOCATION_TOPIC,groupId = constants.groupId)
    public void updatedLocation(String value){
        System.out.println(value);
    }
}
