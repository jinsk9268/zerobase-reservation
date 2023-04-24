package com.zerobase.reservation.domain.review;

import com.zerobase.reservation.domain.BaseEntity;
import com.zerobase.reservation.domain.reservation.Reservation;
import com.zerobase.reservation.domain.store.Store;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Review extends BaseEntity {
  private Integer starRating;
  private String comment;
  @OneToOne
  @JoinColumn(name = "reservation_id")
  private Reservation reservation;

  @ManyToOne
  @JoinColumn(name = "store_id")
  private Store store;
}
