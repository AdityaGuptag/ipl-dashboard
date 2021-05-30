package com.aditya.ipldashboardbackend.repository;

import com.aditya.ipldashboardbackend.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {

    Team findByTeamName(String teamName);
}
