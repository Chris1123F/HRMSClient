package dataservice.hoteldataservice;

import po.*;

public interface HotelDataService {


	public RoomPO seekHotel(String hotel_id);
	
	public ResultMessage addHotel(HotelPO po);
	public ResultMessage modifyHotel(HotelPO po);
	public ResultMessage evaluateHotel(HotelPO po);
}
