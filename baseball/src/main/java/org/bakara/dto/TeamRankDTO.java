package org.bakara.dto;

import lombok.Data;

@Data
public class TeamRankDTO {
	
	int rank ;				//���� 	  
	String teamname;		//���̸�  
	int game; 				//�� ������ Ƚ��
	int victory ; 			//�¸��� Ƚ�� 
	int lose; 				//�� �� Ƚ��
	int draw; 				// ���º� �� Ƚ��
	Long gameodds; 			// �·�
	String gamecar ; 		// ������ 
	String recentgames;		// �ֱ� 10��� 
	String continuity;		//���� 
	String home ; 			// Ȩ 
	String visiting; 		// �湮 
	

}
