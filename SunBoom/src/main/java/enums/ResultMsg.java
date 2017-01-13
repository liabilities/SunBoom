package enums;

/**
 * Created by zoetx on 2017/1/13.
 */
public enum ResultMsg {

    SUCCESS("成功"), FAIL("失败"), OFFLINE("断网");

    private String message;

    private ResultMsg(String ms){
        this.message = ms;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}


