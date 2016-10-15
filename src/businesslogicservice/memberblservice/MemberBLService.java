package businesslogicservice.memberblservice;

import vo.*;
import util.*;

public interface MemberBLService {

	public boolean isCommonMember(String user_id);
	public boolean isCorporateMember(String user_id);
	
	public String createMember_number(MemberVO member);
	
	public int getLevel(MemberVO vo);
	
	public MemberVO registerCommonMember(String user_id);
	public MemberVO registerCorporateMember(String user_id);
	
}
