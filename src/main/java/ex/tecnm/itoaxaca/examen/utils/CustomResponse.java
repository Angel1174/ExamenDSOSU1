package ex.tecnm.itoaxaca.examen.utils;

import java.util.LinkedList;

/**
 *
 * @author angel
 */
public class CustomResponse {
    private Integer httpCode;
    private Object data;
    private String message;
    
    public CustomResponse(){
	this.httpCode=200;
	this.data=new LinkedList();
	this.message="Ok";
    }
    
    public Integer getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMenssage() {
        return message;
    }

    public void setMenssage(String menssage) {
        this.message = menssage;
    }
}
