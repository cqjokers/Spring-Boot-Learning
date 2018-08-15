package top.cqjokers.sbl.exception;

/**
 * Created by IntelliJ IDEA
 * Title: CustomExecption
 * User: cqjokers
 * Date: 2018/8/15
 * Time: 16:22
 * Blog: https://cqjokers.top
 * Description:
 */
public class CustomExecption extends RuntimeException{

    private String code;
    private String message;

    public CustomExecption(String code,String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
