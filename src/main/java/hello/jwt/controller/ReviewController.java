package hello.jwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/review")
public class ReviewController {

    @PostMapping("/add")
    public ResponseEntity<String> writeReview(){
        return ResponseEntity.ok().body("리뷰 등록 완료.");
    }
}
