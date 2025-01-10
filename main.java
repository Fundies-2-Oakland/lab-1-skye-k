class Vector3D {
    private Double x;
    private Double y;
    private Double z;
    public Vector3D (Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public Double getZ() {
        return z;
    }
}

public class main {
    public static void main(String[] args) {
        Vector3D vector3D = new Vector3D(1.0, 2.0, 3.0);
        System.out.println(vector3D.getX());
        System.out.println(vector3D.getY());
        System.out.println(vector3D.getZ());
    }
}