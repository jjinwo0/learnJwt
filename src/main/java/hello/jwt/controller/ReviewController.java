package hello.jwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/review")
public class ReviewController {

    @PostMapping("/add")
    public ResponseEntity<String> writeReview(Authentication authentication){
        return ResponseEntity.ok().body(authentication.getName()+"님의 리뷰 등록 완료.");
    }
}
