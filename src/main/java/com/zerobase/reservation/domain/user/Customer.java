package com.zerobase.reservation.domain.user;

import java.util.Date;
import javax.persistence.Entity;
import lombok.Getter;

@Entity
@Getter
public class Customer extends BaseUser {
    private Date birth;

    public Customer() {
      super();
    }

    public Customer(String email, String password, String name, String mobile, Date birth) {
      super(email, password, name, mobile);
      this.birth = birth;
    }
}
