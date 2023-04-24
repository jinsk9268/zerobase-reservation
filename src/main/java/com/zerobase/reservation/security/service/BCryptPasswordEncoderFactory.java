package com.zerobase.reservation.security.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 비밀번호 암호화
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BCryptPasswordEncoderFactory {

  private static BCryptPasswordEncoder bCryptPasswordEncoder;

  public static BCryptPasswordEncoder getbCryptPasswordEncoder() {
    if (bCryptPasswordEncoder == null) {
      bCryptPasswordEncoder = new BCryptPasswordEncoder();
    }
    return bCryptPasswordEncoder;
  }
}
