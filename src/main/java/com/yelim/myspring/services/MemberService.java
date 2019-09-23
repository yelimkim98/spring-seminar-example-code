package com.yelim.myspring.services;

import com.yelim.myspring.models.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

    private ArrayList<Member> members;

    public MemberService() {
        this.members = new ArrayList<Member>();
    }

    public void addMember(Member member){
        // 멤버 추가
        members.add(member);
    }

    public ArrayList<Member> getMembers(){
        // 모든 멤버 반환
        return members;
    }

    public Member getMemberById(String id){
        // 해당 id를 가진 멤버 반환
        for(Member member : members) {
            if(member.getId().equals(id)){
                return member;
            }
        }

        // 같은애가 없었으면 여기에 도달함
        return null;
    }

    public boolean updateMember(String id, Member updatedMember){
        // 멤버 수정
        for(Member member : members) {
            if(member.getId().equals(id)){
                member.setName(updatedMember.getName());
                member.setContacts(updatedMember.getContacts());
                return true;
            }
        }
        return false;
    }

    public boolean deleteMember(String id){
        // 이 id를 가진 멤버를 삭제
        for(Member member : members) {
            if(member.getId().equals(id)){
                members.remove(member);
                return true;
            }
        }
        return false;
    }
}
