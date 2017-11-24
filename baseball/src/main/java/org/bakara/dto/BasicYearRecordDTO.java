package org.bakara.dto;

import lombok.Data;

@Data
public class BasicYearRecordDTO {
	
	//������ ��Ī�� ���� �ʿ��� ����
	private String teamName, playerName;
	private Double playerNum;
	
	//Ÿ�ڿ� ���� + �Ϻ� ������ ���� ���� ����
	private Double avg, g, pa, ab, r, h, twob, threeb, hr, tb, rbi, sb, cs, sac, sf;
	private Double bb, ibb, hbp, so, gdp, slg, obp, e, sbpercent, mh, ops, risp, phba;
	
	//������ ����
	private Double era, cg, sho, w, l, sv, hld, wpct, tbf, np;
	//9 1/3 ���� ������ ���� String���� �� �ʿ䰡 �ִ� ����
	private String ip;
	private Double wp, bk, er, bsv, whip, qs;

}
