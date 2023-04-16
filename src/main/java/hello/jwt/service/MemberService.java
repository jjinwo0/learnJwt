package hello.jwt.service;

import hello.jwt.dto.MemberDto;
import hello.jwt.entity.Member;
import hello.jwt.repository.MemberRepository;
import hello.jwt.utils.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private MemberRepository memberRepository;

    @Value("${jwt.secret}")
    private String secretKey;
    private Long expiredMs = 1000 * 60 * 60l;

    @Transactional
    public void join(Member member){
        memberRepository.save(member);
    }

    public String login(String username, String password){

        return JwtUtil.createJwt(username, secretKey, expiredMs);
    }
}
