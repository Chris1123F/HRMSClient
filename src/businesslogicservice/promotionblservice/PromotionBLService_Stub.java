package businesslogicservice.promotionblservice;

import util.ResultMessage;
import vo.PromotionVO;
import businesslogicservice.promotionblservice.PromotionBLService;

public class PromotionBLService_Stub implements PromotionBLService{
	
	String promotionName;
	String promotionObject;
	double count;
	String time;
	
	
	public PromotionBLService_Stub(String promotionName,String promotionObject,double count,String time){
		this.promotionName=promotionName;
		this.promotionObject=promotionObject;
		this.count=count;
		this.time=time;
	}

	@Override
	public PromotionVO getPromotion(String id) {
		// TODO Auto-generated method stub
		return new PromotionVO().getPromotionVO();
	}

	@Override
	public PromotionVO[] getAllPromotion() {
		// TODO Auto-generated method stub
		return new PromotionVO().getPromotionVOList();
	}

	@Override
	public ResultMessage addPromotion(PromotionVO vo) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage modifyPromotion(PromotionVO vo) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage delPromotion(PromotionVO vo) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

}