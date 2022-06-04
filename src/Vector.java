//Создайте класс, который описывает вектор (в трёхмерном пространстве).
//        У него должны быть:
//        конструктор с параметрами в виде списка координат x, y, z
//        метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
//        метод, вычисляющий скалярное произведение:
//        метод, вычисляющий векторное произведение с другим вектором:
//        метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами равен скалярному
//        произведению векторов, деленному на произведение модулей (длин) векторов:
//        методы для суммы и разности:
//        статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
//        Если метод возвращает вектор, то он должен возвращать новый объект, а не менять базовый.
//        То есть, нужно реализовать шаблон "Неизменяемый объект"
//

public class Vector {
    private double x;
    private double y;
    private double z;

    public static void main(String[] args) {
        Vector vector1 = new Vector(5.2, 3.7, 2.4);
        Vector vector2 = new Vector(3.7, 1.4, 7.3);

        System.out.println("vector1 length = " + vector1.length());
        System.out.println("vector2 length = " + vector2.length());

        System.out.println("Scalar Product by vector1 and vector2 = " + vector1.scalarProduct(vector2));
        System.out.println("Cross Product by vector1 and vector2 = " + vector1.crossProduct(vector2));
        System.out.println("Angle (cosinus) between by vector1 and vector2 = " + (vector1.angleBetween(vector2)));
        System.out.println("Sum by vector1 and vector2 = " + vector1.sum(vector2));
        System.out.println("Difference between vector1 and vector2 = " + vector1.diff(vector2));
    }

        public Vector(double x, double y, double z){
           this.x = x;
           this.y = y;
           this.z = z;
        }
        public double length(){

        return Math.sqrt(x*x + y*y + z*z);
        }

        public double scalarProduct(Vector vector) {

        return x * vector.x + y * vector.y + z * vector.z;
        }

        public Vector crossProduct(Vector vector) {
            return new Vector (y * vector.z - vector.y * z,
                    z * vector.x - vector.z * x,
                    x * vector.y - y * vector.x); //разобраться с выводом
        }

        public double angleBetween(Vector vector) {

        return scalarProduct(vector) / (length() * vector.length());
        }

        public Vector sum(Vector vector) {
            return new Vector(
                    x + vector.x,
                    y + vector.y,
                    z + vector.z); //разобраться с выводом
        }

        public Vector diff(Vector vector) {
            return new Vector(
                    x - vector.x,
                    y - vector.y,
                    z - vector.z); //разобраться с выводом
        }

    //  статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
    ////        Если метод возвращает вектор, то он должен возвращать новый объект, а не менять базовый.
    ////        То есть, нужно реализовать шаблон "Неизменяемый объект"

        public static Vector [] generate(int n) {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
}
        @Override
        public String toString() {
        return "Vector {"  +
                "x = " + x +
                ", y = " + y +
                ", z = " + z + "}";
    }
}
