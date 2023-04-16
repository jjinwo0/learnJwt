package hello.jwt.controller;

import hello.jwt.dto.MemberDto;
import hello.jwt.entity.Member;
import hello.jwt.repository.MemberRepository;
import hello.jwt.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/members")
public class MemberController {

    private final MemberRepository memberRepository;
    private final MemberService memberService;

    @PostMapping("/login")
    public ResponseEntity<String> login(){
        return ResponseEntity.ok().body(memberService.login("", ""));
    }
}
