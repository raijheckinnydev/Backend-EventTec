package com.raijheckinny.api.repositories;

import com.raijheckinny.api.domin.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IAddressRepository extends JpaRepository<Address, UUID> {
}
