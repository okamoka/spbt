package com.example.demo.presentation.ctl.careplan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/transfer")
public class TransferController {

    @GetMapping("/receive")
    String listReceive() {
        return "receive/list";
    }
    
    @GetMapping("/send")
    String listSend() {
        return "send/list";
    }

}
