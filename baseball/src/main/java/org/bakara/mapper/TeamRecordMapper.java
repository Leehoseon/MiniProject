package org.bakara.mapper;

import org.apache.ibatis.annotations.Select;
import org.bakara.dto.TeamRecordDTO;

public interface TeamRecordMapper {
	
	@Select("select * from tbl_teamrecord")    // �� ���  
	public void teamRecord(TeamRecordDTO dto)  ;
		

}
