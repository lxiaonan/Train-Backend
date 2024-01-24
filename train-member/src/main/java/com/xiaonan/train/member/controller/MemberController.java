package com.xiaonan.train.member.controller;

import com.xiaonan.train.member.domain.TrainMember;
import com.xiaonan.train.member.service.TrainMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    TrainMemberService memberService;
    @PostMapping("/register")
    public String registerMember() {

        // 处理会员注册逻辑
        return "会员注册成功";
    }
    @GetMapping("/list")
    public List<TrainMember> getList(){
        List<TrainMember> list = memberService.list();
        list.stream().peek((x)-> x.setPassword(null)).toList();
        return list;
    }
}
