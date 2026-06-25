package stream;

import java.util.ArrayList;
import java.util.List;

public class UserInfoMapTest {
	public static void main(String[] args) {
		UserInfo userKim = new UserInfo("김영희", 30);
		UserInfo userLee = new UserInfo("이철수", 40);
		UserInfo userSong = new UserInfo("송영수", 55);
		
		List<UserInfo> userInfoList = new ArrayList< >();
		userInfoList.add(userKim);
		userInfoList.add(userLee);
		userInfoList.add(userSong);
		
		userInfoList.stream()
		        .filter(user -> user.getAge() >= 40)
		        .map(UserInfo::getName)
		        .forEach(s-> System.out.println(s));
	}
}
