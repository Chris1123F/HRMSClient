package dataservice.userdataservice;

import java.awt.List;
import po.*;
import util.*;

public interface UserDataService {

	public ResultMessage add(UserPO po);
	public UserPO find(String id);
	public ResultMessage modify(UserPO po);
	
}
