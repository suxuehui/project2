package cn.itcast.pro.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by JohnBi on 2017-11-20. 16:57
 *
 * @author Lemon
 */
public class BaseAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {
    private static final long serialVersionUID = 1L;
    private static Logger log = Logger.getLogger(BaseAction.class);

    protected Map<String, Object> request;
    protected Map<String, Object> session;
    protected Map<String, Object> application;

    public Map<String, Object> getRequest() {
        return request;
    }

    @Override
    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public Map<String, Object> getApplication() {
        return application;
    }

    @Override
    public void setApplication(Map<String, Object> application) {
        this.application = application;
    }

    public void push(Object obj) {
        ActionContext.getContext().getValueStack().push(obj);
    }

    public void put(String key, Object value) {
        ActionContext.getContext().put(key, value);
    }

    public void responseToClient(String context, String type) throws IOException {
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setCharacterEncoding("UTF-8");
        response.setContentType(type);
        response.getWriter().write(context);
    }

}
