package top.cqjokers.sbl.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import top.cqjokers.sbl.exception.CustomExecption;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA
 * Title: GlobalExecptionHandler
 * User: cqjokers
 * Date: 2018/8/15
 * Time: 16:16
 * Blog: https://cqjokers.top
 * Description:
 */
@ControllerAdvice
public class GlobalExecptionHandler {

    /**
     * 返回JSON格式的错误信息
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Map runtimeExceptionHandler(Exception e) {
        Map map = new HashMap();
        map.put("code",10000);
        map.put("message",e.getMessage());
        return map;
    }

    /**
     * 返回错误信息到页面上
     * @param e
     * @return
     */
    @ExceptionHandler(value = CustomExecption.class)
    public ModelAndView CustomExceptionHandler(CustomExecption e) {
        ModelAndView view = new ModelAndView("error");
        view.addObject("code",e.getCode());
        view.addObject("message",e.getMessage());
        return view;
    }
}
