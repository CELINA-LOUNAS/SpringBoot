package fr.sorbonne.paris.nord.university.api.Factory;

import fr.sorbonne.paris.nord.university.api.Entity.TeamEntity;
import fr.sorbonne.paris.nord.university.api.dto.TeamDTO;

public class TeamFactory implements EntityFactory<TeamEntity, TeamDTO> {
	
	@Override
	public TeamEntity toEntity (TeamDTO dto) {
		final TeamEntity teamEntity = new TeamEntity();
		teamEntity.setId(dto.getId());
		teamEntity.setName(dto.getName());
		teamEntity.setSlogan(dto.getSlogan());
		return teamEntity;
	}

	@Override
	public TeamDTO toDto(TeamEntity entity) {
		final TeamDTO teamDTO = new TeamDTO();
		teamDTO.setId(entity.getId());
		teamDTO.setName(entity.getName());
		teamDTO.setSlogan(entity.getSlogan());
		return teamDTO;
	}

}
