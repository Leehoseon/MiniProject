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
	Long gameodds; 			// �·�
	String gamecar ; 		// ������ 00
	String recentgames;		// �ֱ� 10��� 
	String continuity;		//���� 
	String home ; 			// Ȩ 
	String visiting; 		// �湮 
	

}
