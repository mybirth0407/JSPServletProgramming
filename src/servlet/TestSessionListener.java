package servlet;

import javax.servlet.http.*;

public class TestSessionListener {
    public TestSessionListener() {
        System.out.println("TestSessionListener 객체 생성");
    }

    public void sessionCreated(HttpSessionEvent e) {
        System.out.println("세션 객체 생성");
    }

    public void sessionDestroyed(HttpSessionEvent e) {
        System.out.println("세션 객체 해제");
    }
}
