package fastcampus.projectboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {

    private Long id;    // 댓글 아이디
    private Article article;    // 특정 Article에 대한 Comment이므로, 객체지향적으로 연동
    private String content; // 댓글 내용

    private LocalDateTime createdAt;    // 생성일시
    private String createdBy;   // 생성자
    private LocalDateTime modifiedAt;   // 수정일시
    private String modifiedBy;  // 수정자

}
