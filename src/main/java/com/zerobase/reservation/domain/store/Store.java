package com.zerobase.reservation.domain.store;

import com.zerobase.reservation.domain.BaseEntity;
import com.zerobase.reservation.domain.reservation.Reservation;
import com.zerobase.reservation.domain.review.Review;
import com.zerobase.reservation.domain.user.Partner;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Store extends BaseEntity {

  private String name;
  private String address;
  private String contacts;
  @ManyToOne
  @JoinColumn(name = "partner_id")
  private Partner partner;
  @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
  private List<Reservation> reservations = new ArrayList<>();

  @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
  private List<Review> reviews = new ArrayList<>();
}
