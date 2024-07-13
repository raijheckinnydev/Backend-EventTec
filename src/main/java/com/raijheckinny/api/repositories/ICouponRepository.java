package com.raijheckinny.api.repositories;

import com.raijheckinny.api.domin.coupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ICouponRepository extends JpaRepository<Coupon, UUID> {
}
