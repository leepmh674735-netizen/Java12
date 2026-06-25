package optional;

import java.util.ArrayList;

public class UserInfoTest {
	public static void main(String[] args) {
		ArrayList<UserInfo> userInfoList = new ArrayList<>();
		userInfoList.add(new UserInfo(12345, "James"));
		userInfoList.add(new UserInfo(12345, "Tomas"));
        userInfoList.add(new UserInfo(12347, "Edward"));
        
        UserInfo userInfo = getUserInfoById(12345, userInfoList);
        System.out.println(userInfo.getName());
	}
	
	public static UserInfo getUserInfoById(int id, ArrayList<UserInfo> list) {
		for (UserInfo userInfo : list) {
			if (id == userInfo.getId())
				return userInfo;
		}
		return null;
	}
}
