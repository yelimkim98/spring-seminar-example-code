package com.yelim.myspring.controllers;

import com.yelim.myspring.models.Member;
import com.yelim.myspring.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    // 스프링 안에서 생성된 어떤 객체를 자동으로 가져올 수 있다
    // 어떤 객체를 가져올 수 있냐면, @Service 이런거로 등록된 객체들.
    @Autowired
    private MemberService memberService;

    // 아래들은 매핑이 다 똑같지만, method를 보고서 다르게 구별되는것임

    @RequestMapping(method= RequestMethod.POST)
    public void addMember(@RequestBody Member member){
        memberService.addMember(member);
    }

    @RequestMapping(method=RequestMethod.GET)
    public List<Member> getMember(){
        return memberService.getMembers();
    }

    // /members/17101198 이런식으로 요청을 보내면
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Member getMemberById(@PathVariable("id") String id){
        return memberService.getMemberById(id);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public boolean updateMember(@PathVariable("id") String id, @RequestBody Member member){
        return memberService.updateMember(id, member);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public boolean deleteMember(@PathVariable("id") String id){
        return memberService.deleteMember(id);
    }
}