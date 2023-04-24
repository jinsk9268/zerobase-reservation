package com.zerobase.reservation.domain.user;

import com.zerobase.reservation.domain.BaseEntity;
import com.zerobase.reservation.security.service.BCryptPasswordEncoderFactory;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@MappedSuperclass
@NoArgsConstructor
@Getter
public abstract class BaseUser extends BaseEntity {

  @Column(unique = true)
  private String email;
  private String password;
  private String name;
  private String mobile;

  /**
   * 계정 필수 요소 생성 (password는 암호화)
   */
  public BaseUser(String email, String password, String name, String mobile) {
    this.email = email;
    this.password = BCryptPasswordEncoderFactory.getbCryptPasswordEncoder().encode(password);
    this.name = name;
    this.mobile = mobile;
  }
}
