package entities;

public class ErrorResponse {
	private int code;
	private String message;
	
	public ErrorResponse(){
		this.code=0;
		this.message="";
	}
	public ErrorResponse(int code,String message){
		this.code=code;
		this.message=message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
