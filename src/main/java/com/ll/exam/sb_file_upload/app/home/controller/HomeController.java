package com.ll.exam.sb_file_upload.app.home.controller;

import com.ll.exam.sb_file_upload.app.member.entity.Member;
import com.ll.exam.sb_file_upload.app.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final MemberService memberService;

    @GetMapping("/")
    public String showMain() {
        return "home/main";
    }

    @GetMapping("/about")
    public String showAbout() {
        return "home/about";
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/currentUserOrigin")
    @ResponseBody
    public Principal currentUserOrigin(Principal principal) {
        return principal;
    }
}
