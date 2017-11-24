package org.bakara.dto;

import lombok.Data;

@Data
public class RecentGameRecordDTO {

	// ������ ��Ī�� ���� �ʿ��� ����
	private String playerName;
	private Double playerNum;

	private String gameDate, versus;
	
	private Double avg, ab, r, h, twob, threeb, hr, rbi, sb, cs, bb, hbp, so, gdp;
	
	private String result;
	private Double era, tbf;
	private String ip;
	private Double er;
	
}
