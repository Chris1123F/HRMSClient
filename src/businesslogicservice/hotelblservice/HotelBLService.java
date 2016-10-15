package businesslogicservice.hotelblservice;

import vo.*;


public interface HotelBLService {

	public HotelVO viewHotel();
	public HotelVO seekHotel(String id);
	
	public ResultMessage addHotel(HotelVO vo);
	public ResultMessage modifyHotel(HotelVO vo);
	public ResultMessage evaluateHotel(HotelVO vo);
}
