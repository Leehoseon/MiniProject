package org.bakara.service;

import java.util.List;

import org.bakara.dto.TeamPlayerDTO;
import org.bakara.dto.TeamRecordDTO;

public interface TeamPlayerService {
	
	public void crawlTeamPlayer(TeamPlayerDTO dto);
	
	public List<TeamPlayerDTO> selectTeamPlayer();   //TeamPlayer ���� �ѷ��ִ� 
	
	

}
