package models;

public class Databasemanagement {
	public boolean kiemTraUser(String username, String password){
		// voi database tao query de: lay du, kiem tra du lieu trong database tuy vao yeu cau bai toan.
		if(username.equalsIgnoreCase("maivantuit") && password.equalsIgnoreCase("123456")){
			return true;
		}else{
			return false;
		}
	}
}
