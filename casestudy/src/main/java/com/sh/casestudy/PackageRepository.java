package com.sh.casestudy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PackageRepository extends JpaRepository<Package, Long> {
    
    @Query("SELECT m FROM Package m WHERE m.cancelled = 0")
    List<Package> findAllThoseNotCancelled();

    @Query("SELECT m FROM Package m WHERE m.cancelled = 0 AND m.id = ?1")
    List<Package> findPackageById(Long id);

}
