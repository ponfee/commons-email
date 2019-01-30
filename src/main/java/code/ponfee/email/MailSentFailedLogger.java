package code.ponfee.email;

/**
 * 邮件发送失败日志接口
 * 
 * @author Ponfee
 */
public interface MailSentFailedLogger {

    void log(String logid, int retries, MailEnvelope envelope, Exception e);
}
