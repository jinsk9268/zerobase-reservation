package com.zerobase.reservation.constants;

public class ValidatePattern {
  // 이메일 정규식
  public static final String EMAIL = "^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$";

  // 비밀번호 정규식 (8-30자, 특수문자, 숫자, 문자 모두 포함 필요)
  public static final String PASSWORD = "^.*(?=^.{8,30}$)(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$";

  // 모바일 정규식

}
