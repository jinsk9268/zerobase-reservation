package com.zerobase.reservation.domain.user;

import com.zerobase.reservation.domain.store.Store;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Partner extends BaseUser {

  public Partner(String email, String password, String name, String mobile) {
    super(email, password, name, mobile);
  }
}
