package com.justin.csclient.controller;

import com.justin.csclient.service.ConfigServerDynamicService;
import com.justin.csclient.service.ConfigServerStaticService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;

/**
 * http://localhost:8094/config/static
 * http://localhost:8094/config/dynamic
 */
@Controller
@RequiredArgsConstructor(onConstructor = @__(@Inject))
@RequestMapping(value = "/config", produces = MediaType.TEXT_HTML_VALUE)
public class ConfigClientTestController {

    private final @NotNull ConfigServerStaticService configServerStaticService;

    private final @NotNull ConfigServerDynamicService configServerDynamicService;

    @GetMapping(value = "/static")
    public String getKeywordFromConfigServerByStatic(Model model) {
        model.addAllAttributes(configServerStaticService.getKeyword());
        return "checkKeyword";
    }

    @GetMapping(value = "/dynamic")
    public String getKeywordFromConfigServerByDynamic(Model model) {
        model.addAllAttributes(configServerDynamicService.getKeyword());
        return "checkKeyword";
    }


}
