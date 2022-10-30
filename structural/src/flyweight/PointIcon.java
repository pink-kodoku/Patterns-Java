package flyweight;

public class PointIcon {
    private final PointType type;
    private final char[] icon;

    public PointIcon(PointType type, char[] icon) {
        this.type = type;
        this.icon = icon;
    }

    public PointType getType() {
        return type;
    }
}
