package com.aditya.ipldashboardbackend.controller;

import com.aditya.ipldashboardbackend.model.Match;
import com.aditya.ipldashboardbackend.model.Team;
import com.aditya.ipldashboardbackend.repository.MatchRepository;
import com.aditya.ipldashboardbackend.repository.TeamRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin
public class TeamController {

    private TeamRepository teamRepository;
    private MatchRepository matchRepository;

    public TeamController(TeamRepository teamRepository, MatchRepository matchRepository) {
        this.teamRepository = teamRepository;
        this.matchRepository = matchRepository;
    }

    @GetMapping("/team")
    public Iterable<Team> getAllTeams() {
        return this.teamRepository.findAll();
    }

    @GetMapping("/team/{teamName}")
    public Team getTeam(@PathVariable String teamName) {

        Team team = this.teamRepository.findByTeamName(teamName);
        team.setMatches(this.matchRepository.findLatestMatchesByTeam(teamName, 4));

        return team;

    }

    @GetMapping("/team/{teamName}/matches")
    public List<Match> getMatchesForTeam(@PathVariable String teamName, @RequestParam int year) {
        LocalDate startdate = LocalDate.of(year, 1, 1);
        LocalDate endDate = LocalDate.of(year + 1, 1, 1);
//        return this.matchRepository.getByTeam1AndDateBetweenOrTeam2AndDateBetweenOrderByDateDesc(
//                    teamName,
//                    startdate,
//                    endDate,
//                    teamName,
//                    startdate,
//                    endDate
//                );
        return this.matchRepository.getMatchesByTeamBetweenDates(
                teamName,
                startdate,
                endDate
        );
    }
}
