package com.example.restservice;

// POJO (plain old java object) class

public class LoginResult {
	boolean result; // 당장은 로그인 성공 & 실패 여부만 알아도 충분
	public static boolean tryLogin(String userID, String password) {
		// TODO) DB 연동?
		// 임시구현, yeojin_jeon / 1234! 일 때만 로그인 성공인 걸로...
		return userID.equals(new String("yeojin_jeon"))
				&& password.equals(new String("1234!"))
				? true : false; 
	}
	
	public LoginResult(String userID, String password) {
		// password, id encryption은 일단 무시
		this.result = tryLogin(userID, password);
	}

	public boolean getResult()
	{
		return this.result;
	}
//	public LoginResult(String id) {
//		this(id, new String("1234"));
//	}
//	
//	public String getID()	{
//		return userID;
//	}
//	
//	public boolean isPasswordMatched(String password) {
//		if(this.password == password)
//			return true;
//		else
//			return false;
//	}
	
}
