package com.zerobase.reservation.domain.reservation;

import com.zerobase.reservation.domain.BaseEntity;
import com.zerobase.reservation.domain.review.Review;
import com.zerobase.reservation.domain.store.Store;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;

@Entity
public class Reservation extends BaseEntity {
  private LocalDateTime reservationTime;
  private boolean visitStatus;
  @Enumerated(EnumType.STRING)
  private ApprovalStatus approvalStatus;
  @ManyToOne
  @JoinColumn(name = "store_id")
  private Store store;
  @OneToOne(mappedBy = "reservation")
  private Review review;

  @PrePersist
  public void prePersist() {
    this.visitStatus = false;
    this.approvalStatus = ApprovalStatus.PENDING;
  }
}
