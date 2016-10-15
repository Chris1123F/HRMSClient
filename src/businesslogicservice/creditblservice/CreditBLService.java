package businesslogicservice.creditblservice;

import vo.*;
import java.util.List;
import util.*;

public interface CreditBLService {

	public CreditVO getCredit(String user_id);
	public List<CreditVO> getRecord(String user_id);
	public ResultMessage deduct(CreditVO credit,String user_id,int change);
	public CreditVO deposit(CreditVO credit);
	
}
