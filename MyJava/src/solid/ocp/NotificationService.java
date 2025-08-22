package solid.ocp;

public interface NotificationService {
    public void sendOTP(String medium);

    public void sendStatement(String medium);
}
