package dataservice.memberdataservice;

import po.*;
import util.*;

public interface MemberDataService {

	public ResultMessage add(String user_id);
	public MemberPO find(String user_id);
	public ResultMessage createMemberNumber(MemberPO member);
	
}
