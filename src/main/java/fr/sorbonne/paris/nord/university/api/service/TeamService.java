package fr.sorbonne.paris.nord.university.api.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import fr.sorbonne.paris.nord.university.api.dto.TeamDTO;
import fr.sorbonne.paris.nord.university.api.Entity.TeamEntity;

@Repository
public interface TeamService{
	List<TeamDTO> getAllTeams();
	
	Optional<TeamDTO> getTeamById(Long teamId);
	
	void addTeam(TeamDTO team);
	
	void updateTeam(TeamDTO team);
	
	void deleteTeamById(Long id);

	Optional<TeamDTO> getTeamById(long Teamid);

	void deleteTeamEntity(long id);

	
	
	
}