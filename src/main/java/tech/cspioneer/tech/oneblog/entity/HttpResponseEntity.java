package tech.cspioneer.tech.oneblog.entity;



import lombok.Data;

import java.io.Serializable;

//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Data
public class HttpResponseEntity implements Serializable {

  private int code; //状态码
  private Object data; //内容
  private String message; //状态消息


  public HttpResponseEntity() {
    }


  public HttpResponseEntity(int code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

}
