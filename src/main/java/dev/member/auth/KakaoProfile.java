package dev.member.auth;

import lombok.Data;

/*카카오 토큰값을 다시 보내서 사용자 정보 받는 프로파일 */
@Data
public class KakaoProfile {


    public Long id;
    public String connected_at;
    public Properties properties;
    public KakaoAccount kakao_account;
    @Data
    class Properties {

        public String nickname;
        public String profile_image;
        public String thumbnail_image;
    }
    @Data
    class KakaoAccount {

        public Boolean profile_nickname_needs_agreement;
        public Boolean profile_image_needs_agreement;
        public Profile profile;
        public Boolean has_email;
        public Boolean email_needs_agreement;
        public Boolean is_email_valid;
        public Boolean is_email_verified;
        public String email;
        @Data
        class Profile {

            public String nickname;
            public String thumbnail_image_url;
            public String profile_image_url;
            public Boolean is_default_image;
        }
    }
}