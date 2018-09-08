// Copyright 2018 Mobvoi Inc. All Rights Reserved.

package com.huyan.demo.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * created by pfliu on 2018/9/2
 */
@Controller
public class StatusController {

  @GetMapping(value = "/status")
  public String status(Map<String,Object> map) {
    map.put("hello","from TemplateController.helloHtml");
    return"index";

}

}
