package businesslogicservice.userblservice;

import vo.*;
import util.*;

public interface UserBLService {

	public boolean login(String user_id,String password);
	
	public UserVO userType(String user_id);
	public UserVO getInfomation(String user_id);
	public UserVO modify(UserVO vo);
	
	public ResultMessage saveModify(UserVO vo);
	
}
