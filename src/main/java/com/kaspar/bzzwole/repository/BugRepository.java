package com.kaspar.bzzwole.repository;

import com.kaspar.bzzwole.model.Bug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BugRepository extends JpaRepository<Bug, Long> {

}
