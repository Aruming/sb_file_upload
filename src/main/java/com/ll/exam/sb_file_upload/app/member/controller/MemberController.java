package com.ll.exam.sb_file_upload.app.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor
@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/join")
    public String showJoin(){
        return "member/join";
    }

    @PostMapping("/join")
    @ResponseBody
    public String join() {
        return "가입완료";
    }
}
