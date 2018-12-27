package com.justin.csclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RefreshScope
public class ConfigServerDynamicService {
    @Value("${sampleconfig.app.first}")
    private String first;

    @Value("${sampleconfig.app.second}")
    private String second;

    public Map<String, String> getKeyword() {
        Map<String, String> keyword = new HashMap<>();
        keyword.put("first", first);
        keyword.put("second", second);

        return keyword;
    }
}
