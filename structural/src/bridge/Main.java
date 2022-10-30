package bridge;

public class Main {
    public static void main(String[] args) {
        var remoteControl = new RemoteControl(new SonyTV());
        remoteControl.turnOn();
        var advancedRemoteControl = new AdvancedRemoteControl(new SonyTV());
        advancedRemoteControl.setChannel(5);

        var remoteControl2 = new RemoteControl(new SamsungTV());

        remoteControl2.turnOn();
    }
}
