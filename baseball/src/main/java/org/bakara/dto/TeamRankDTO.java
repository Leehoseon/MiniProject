package org.bakara.dto;

import lombok.Data;

@Data
public class TeamRankDTO {
	
	int rank ;				//���� 	  
	String teamName;		//���̸�  
	int game; 				//�� ������ Ƚ��
	int victory ; 			//�¸��� Ƚ�� 
	int lose; 				//�� �� Ƚ��
	int draw; 				// ���º� �� Ƚ��
	Long gameOdds; 			// �·�
	String gameCar ; 		// ������ 00
	String recentGames;		// �ֱ� 10��� 
	String continuity;		//���� 
	String home ; 			// Ȩ 
	String visiting; 		// �湮 
	

}
